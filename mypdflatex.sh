rm *.bbl *.aux *.glo *.gls *.ist *.ilg *.log *.out *.blg *.synctex.gz *.toc *.lof *.acn *.acr *.glg *.xdy *.alg

pdflatex pflichtenheft.tex
makeglossaries pflichtenheft.glo
pdflatex pflichtenheft.tex
pdflatex pflichtenheft.tex
evince pflichtenheft.pdf
