package gui;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

//TODO: Muss vlt noch zusätzlich ein SelectionModel bekommen, welches die selection der Knoten per Maus überwacht.
// Implementation großteils von http://stackoverflow.com/questions/29506156/javafx-8-zooming-relative-to-mouse-pointer
// muss noch umgeschrieben und angepasst werden.

/**
 * Eine Oberfläche auf der Graphen gezeichnet/dargestellt werden können. Die
 * View bietet verschiedene Navigationsmöglichkeiten und einen Zoom.
 * 
 * @author Nicolas
 */
public class GraphView extends Pane {

	DoubleProperty myScale = new SimpleDoubleProperty(1.0);

	/**
	 * Konstruktor.
	 */
	public GraphView() {
		// setPrefSize(600, 600);
		// setStyle("-fx-background-color: lightgrey;");

		// add scale transform
		scaleXProperty().bind(myScale);
		scaleYProperty().bind(myScale);
	}

	/**
	 * Add a grid to the canvas, send it to back
	 */
	public void addGrid() {
		double w = getBoundsInLocal().getWidth();
		double h = getBoundsInLocal().getHeight();

		// add grid
		Canvas grid = new Canvas(w, h);
		// don't catch mouse events
		grid.setMouseTransparent(true);

		GraphicsContext gc = grid.getGraphicsContext2D();
		gc.setStroke(Color.GRAY);
		gc.setLineWidth(1);

		// draw grid lines
		double offset = 50;
		for (double i = offset; i < w; i += offset) {
			gc.strokeLine(i, 0, i, h);
			gc.strokeLine(0, i, w, i);
		}

		getChildren().add(grid);

		grid.toBack();
	}

	public double getScale() {
		return myScale.get();
	}

	public void setScale(double scale) {
		myScale.set(scale);
	}

	public void setPivot(double x, double y) {
		setTranslateX(getTranslateX() - x);
		setTranslateY(getTranslateY() - y);
	}
	
	/**
	 * Setzt den Graphen der in der View angezeigt werden soll und erstellt diesen.
	 * 
	 * @param graph Der Graph der in der View dargestellt werden soll.
	 */
	public void setGraph(/* IGraph graph */) {
	}

	//Testfunktion später private.
	public void setNode(double x, double y, String text) {
		VertexShape test = new VertexShape(text);
		test.relocate(x, y);
		getChildren().add(test);
	}
}
