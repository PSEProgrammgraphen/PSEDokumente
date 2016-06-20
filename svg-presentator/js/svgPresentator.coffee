viewX          = 0
viewY          = 0
viewScale      = 1
viewRotation   = 0
viewWidth      = window.innerWidth || document.documentElement.clientWidth || document.getElementsByTagName('body')[0].clientWidth
viewHeight     = window.innerHeight|| document.documentElement.clientHeight|| document.getElementsByTagName('body')[0].clientHeight
slideNumber    = 0
stepNumber     = -1
inAnimation    = false
hiddenOpacity  = 0.2
maxSlideNumber = 0
hasOverview    = false
overview       = null
root           = exports ? this

log = (text) -> console.log(text)

scaleThatfitsInto = (boundaryWidth, boundaryHeight, objectWidth, objectHeight) ->
    boundaryRatio = boundaryHeight / boundaryWidth
    objectRatio   = objectHeight / objectWidth

    if (boundaryRatio < objectRatio)
        boundaryHeight / objectHeight
    else
        boundaryWidth / objectWidth

createTransformString = (x, y, scale = 1, rotation = 0, originX = 0, originY = 0) -> "t#{x},#{y}s#{scale},#{scale},#{originX},#{originY}r#{rotation},#{originX},#{originY}"

linearInterpolate = (from, to, step, numberOfSteps) -> from + ((to - from) * step / numberOfSteps)

centerObject = (graph, object) ->
    rotation     = Snap.deg Math.acos object.transform().localMatrix.a
    graph.transform createTransformString 0, 0, 1, rotation
    bBox         = object.node.getBoundingClientRect()
    scale        = scaleThatfitsInto viewWidth, viewHeight, bBox.width, bBox.height
    translationX = (viewWidth - bBox.width * scale) / 2  - bBox.left * scale
    translationY = (viewHeight - bBox.height * scale) / 2  - bBox.top * scale
    viewX        = translationX
    viewY        = translationY
    viewScale    = scale
    viewRotation = rotation

    graph.transform createTransformString translationX, translationY, scale, rotation


centerObjectAnimated = (graph, object, time = 1000) ->
    rotation     = Snap.deg Math.acos object.transform().localMatrix.a
    graph.transform createTransformString 0, 0, 1, rotation
    bBox         = object.node.getBoundingClientRect()
    scale        = scaleThatfitsInto viewWidth, viewHeight, bBox.width, bBox.height
    translationX = (viewWidth - bBox.width * scale) / 2  - bBox.left * scale
    translationY = (viewHeight - bBox.height * scale) / 2  - bBox.top * scale
    inAnimation  = true

    Snap.animate 1, 1000, (l) ->
        xInterpolation        = linearInterpolate viewX, translationX, l, 1000
        yInterpolation        = linearInterpolate viewY, translationY, l, 1000
        scaleInterpolation    = linearInterpolate viewScale, scale, l, 1000    
        rotationInterpolation = linearInterpolate viewRotation, rotation, l, 1000           
        string = createTransformString xInterpolation, yInterpolation, scaleInterpolation, rotationInterpolation
        graph.attr { transform: string }
    , time, mina.easeinout, () ->
        viewX        = translationX
        viewY        = translationY
        viewScale    = scale
        viewRotation = rotation
        inAnimation  = false

showSlide = (graph, slide) -> 
    log 1
    centerObjectAnimated graph, slide, 500

showStep = (step) -> step.attr {"fill-opacity": step.attr("original-fill-opacity"), "stroke-opacity": step.attr("original-stroke-opacity")}

hideStep = (step) -> step.attr {"fill-opacity": hiddenOpacity, "stroke-opacity": hiddenOpacity}

hideSteps = (graph) ->
    steps = graph.selectAll '.step'
    steps.forEach (step) ->
        originalFillOpacity   = step.attr "fill-opacity"
        originalStrokeOpacity = step.attr "stroke-opacity"
        step.attr {"fill-opacity": hiddenOpacity, "stroke-opacity": hiddenOpacity, "original-fill-opacity": originalFillOpacity, "original-stroke-opacity": originalStrokeOpacity}

showSteps = (graph) ->
    steps = graph.selectAll '.step'
    steps.forEach showStep

next = (graph) ->
    slide = graph.select '.slide[slideNumber="' + slideNumber + '"]'
    steps = slide.selectAll '.step'
    stepNumber++

    if stepNumber >= steps.length
        stepNumber = -1
        slideNumber++

        if slideNumber is maxSlideNumber + 1
            slideNumber = 0
            hideSteps graph

        showSlide graph, graph.select '.slide[slideNumber="' + slideNumber + '"]'
    else
        showStep slide.select '.step[stepNumber="' + stepNumber + '"'

previous = (graph) ->
    slide = graph.select '.slide[slideNumber="' + slideNumber + '"]'
    steps = slide.selectAll '.step'

    if stepNumber < 0
        slideNumber--

        if slideNumber is -1
            slideNumber = maxSlideNumber
            showSteps graph

        slide      = graph.select '.slide[slideNumber="' + slideNumber + '"]'
        steps      = slide.selectAll '.step'
        stepNumber = steps.length - 1
        showSlide graph, slide
    else
        hideStep slide.select '.step[stepNumber="' + stepNumber + '"]'
        stepNumber--

keyDownHandler = (e, graph) ->
    e       = e || window.event
    keycode = e.keyCode

    return if inAnimation
    if keycode is 37 #left
        previous graph
    else if keycode is 38 #up
        if hasOverview
            showSlide graph, overview
    else if keycode is 39 #right
        next graph
    else if keycode is 40 #down
        if hasOverview
            showSlide graph, graph.select '.slide[slideNumber="' + slideNumber + '"'

registerClickables = (graph) ->
    clickables = graph.selectAll '.clickable'
    clickables.forEach (clickable) ->
        clickable.node.onclick = (e) ->
            showSlide graph, graph.select '#' + this.id

init = (f) -> 
    snap           = Snap() 
    graph          = f.select 'g'
    top            = snap.g()
    slides         = graph.selectAll '.slide'
    startSlide     = graph.select '.slide[slideNumber="' + slideNumber + '"'
    overview       = graph.select '.overview'
    hasOverview    = overview?
    maxSlideNumber = slides.length - 1

    snap.attr {viewBox: [0, 0, viewWidth, viewHeight]} 
    hideSteps graph
    top.add graph
    centerObject graph, startSlide   
    registerClickables graph

    window.onkeydown = (e) -> 
        keyDownHandler e, graph

load = (file) -> Snap.load file, init

root.load = load