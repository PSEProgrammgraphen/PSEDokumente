window.onload = function () {
    var viewX           = 0,
        viewY           = 0,
        viewScale       = 1,
        viewRotation    = 0,
        g               = Snap(),
        viewPortWidth   = window.innerWidth || document.documentElement.clientWidth || document.getElementsByTagName('body')[0].clientWidth,
        viewPortHeight  = window.innerHeight|| document.documentElement.clientHeight|| document.getElementsByTagName('body')[0].clientHeight,
        slideNumber     = 0,
        maxSlideNumber  = 0,
        stepNumber      = -1,
        animated        = false,
        hiddenOpacity   = 0.2;

    g.attr({
        viewBox: [0, 0, viewPortWidth, viewPortHeight]
    });

    var getFittingLength = function (viewWidth, viewHeight, objectWidth, objectHeight) {
        var viewRatio = viewWidth / viewHeight,
        objectRatio = objectWidth / objectHeight,
        width = 0,
        height = 0;

        if (viewRatio > objectRatio) {
            height = viewHeight;
            width = viewHeight * objectRatio;
        } else {
            height = viewWidth / objectRatio;
            width = viewWidth;
        }

        return {width: width, height: height};
    };

    var getTransformationGoal = function (viewWidth, viewHeight, objectX, objectY, objectWidth, objectHeight, localX, localY, rotation) {
        rotDeg = Snap.deg(rotation)
        rotatedWidth = Math.cos(rotDeg) * objectWidth + Math.sin(rotDeg) * objectHeight;
        rotatedHeight = Math.sin(rotDeg) * objectWidth + Math.cos(rotDeg) * objectHeight;
        var fittingLength = getFittingLength(viewWidth, viewHeight, rotatedWidth, rotatedHeight),
        scaleRatio = fittingLength.width / objectWidth,
        viewX = (viewWidth - fittingLength.width) / 2,
        viewY = (viewHeight - fittingLength.height) / 2;
        objectX = objectX;
        objectY = objectY;
        rotatedX = Math.cos(rotDeg) * objectX + Math.sin(rotDeg) * objectY;
        rotatedY = Math.sin(rotDeg) * objectX + Math.cos(rotDeg) * objectY;
        rotatedOffsetX = Math.sin(rotDeg) * localX;
        rotatedOffsetY = - Math.sin(rotDeg) * localY;
        
        //console.log("" + rotatedX + " x " + rotatedY);

        return {x: viewX - (rotatedX * scaleRatio - rotatedOffsetX * scaleRatio),
                y: viewY - (rotatedY * scaleRatio),
                scale: scaleRatio,
                width: fittingLength.width,
                height: fittingLength.height,
                rotation: rotation
            };
    };

    var goalToString = function(x, y, scale, rotation) {
        return "t"+x+","+y+"s"+scale+","+scale+",0,0r" + rotation + ",0,0";
    }

    var linearInterpolate = function (from, to, step, numberOfSteps) {
        var diff = to - from;
        return from + (diff * step / numberOfSteps);
    }

    var showSlide = function (graph, slideNumber) {
        slide = graph.select('.slide[slideNumber="' + slideNumber + '"]');
        transformGraphToCenterObject(graph, slide);
    }

    var nextSlide = function (graph) {
        slideNumber++;

        if (slideNumber == maxSlideNumber) {
            slideNumber = 0;
            hideSteps(graph);
        }

        showSlide(graph, slideNumber);
    }

    var previousSlide = function (graph) {
        slideNumber--;

        if (slideNumber < 0) {
            slideNumber = maxSlideNumber - 1;
            showSteps(graph);
        }

        slide = graph.select('.slide[slideNumber="' + slideNumber + '"]');
        stepNumber = slide.selectAll(".step").length - 1;
        showSlide(graph, slideNumber);
    }

    var showStep = function(slide, stepNumber) {
        step = slide.select('.step[stepnumber="' + stepNumber + '"]');
        originalFillOpacity = step.attr("original-fill-opacity");
        originalStrokeOpacity = step.attr("original-stroke-opacity");
        step.attr({"fill-opacity": originalFillOpacity, "stroke-opacity": originalStrokeOpacity});
    }

    var hideStep = function(slide, stepNumber) {
        step = slide.select('.step[stepnumber="' + stepNumber + '"]');
        step.attr({"fill-opacity": hiddenOpacity, "stroke-opacity": hiddenOpacity});
    }

    var next = function (graph) {
        slide = graph.select('.slide[slideNumber="' + slideNumber + '"]');
        steps = slide.selectAll('.step');
        stepNumber++;

        if (stepNumber >= steps.length) {
            stepNumber = -1;
            nextSlide(graph);
            return;
        }

        showStep(slide, stepNumber);
    }

    var previous = function (graph) {
        slide = graph.select('.slide[slideNumber="' + slideNumber + '"]');
        steps = slide.selectAll('.step');

        if (stepNumber < steps.length && stepNumber >= 0) {
            hideStep(slide, stepNumber);
            stepNumber--;
        } else {
            previousSlide(graph);
        }
    }

    var hideSteps = function(graph) {
        var steps = graph.selectAll('.step');

        steps.forEach(function (step, i, a) {
            originalFillOpacity = step.attr("fill-opacity");
            originalStrokeOpacity = step.attr("stroke-opacity");
            step.attr({"fill-opacity": hiddenOpacity, "stroke-opacity": hiddenOpacity, "original-fill-opacity": originalFillOpacity, "original-stroke-opacity": originalStrokeOpacity});
        })
    }

    var showSteps = function(graph) {
        var steps = graph.selectAll('.step');

        steps.forEach(function (step, i, a) {
            originalFillOpacity = step.attr("original-fill-opacity");
            originalStrokeOpacity = step.attr("original-stroke-opacity");
            step.attr({"fill-opacity": originalFillOpacity, "stroke-opacity": originalStrokeOpacity});
        })
    }

    var transformGraphToCenterObject = function (graph, object) {
        bBox = object.getBBox();
        console.log(bBox);
        rotation = Snap.deg(Math.acos(object.transform().localMatrix.a));
        transformations = getTransformationGoal(viewPortWidth, viewPortHeight, bBox.x, bBox.y, bBox.width, bBox.height, bBox.width, bBox.height, rotation);
        animated = true;

        Snap.animate(0, 1000, function (l) {
            // Safari bug workaround: forcing redraw
            //g.attr({width: 100 + (flag = !flag ? 1e-5 : 0) + "%"});

            xInterpolation = linearInterpolate(viewX, transformations.x, l, 1000); 
            yInterpolation = linearInterpolate(viewY, transformations.y, l, 1000);
            scaleInterpolation = linearInterpolate(viewScale, transformations.scale, l, 1000);    
            rotationInterpolation = linearInterpolate(viewRotation, rotation, l, 1000);           
            string = goalToString(xInterpolation, yInterpolation, scaleInterpolation, rotationInterpolation);
            //
            graph.attr({
                transform: string
            });
        }, 500, mina.easeinout, function() {
            viewX = transformations.x;
            viewY = transformations.y;
            viewScale = transformations.scale;
            viewRotation = rotation;
            animated = false;
        });
    }
    
    Snap.load("svg/slidetest.svg", function (f) {
        var graph          = f.select("g"),
            top            = g.g(),
            slides         = graph.selectAll('.slide'),
            startslide     = graph.select('.slide[slideNumber="0"]');
        
        hideSteps(graph);

        maxSlideNumber = slides.length;
        top.add(graph);

        var flag;

        bBox            = startslide.getBBox();
        transformations = getTransformationGoal(viewPortWidth, viewPortHeight, bBox.x, bBox.y, bBox.width, bBox.height, 0, 0, 0);
        string          = goalToString(transformations.x, transformations.y, transformations.scale, 0);
        graph.attr({transform: string});
        viewX           = transformations.x;
        viewY           = transformations.y;
        viewScale       = transformations.scale;

        window.onkeydown = function (e) {
            e = e || window.event;

            if (animated) {
                return;
            }
            if (e.keyCode == '39') {
                //right arrow
                next(graph);
            }
            else if (e.keyCode == '37') {
                //left arrow
                previous(graph);
            }
        }
    });
};