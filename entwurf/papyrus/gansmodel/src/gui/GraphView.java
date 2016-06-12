package gui;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

//TODO: Muss vlt noch zusaetzlich ein SelectionModel bekommen, welches die selection der Knoten per Maus ueberwacht.
// Implementation grossteils von http://stackoverflow.com/questions/29506156/javafx-8-zooming-relative-to-mouse-pointer
// muss noch umgeschrieben und angepasst werden.

/**
 * A view used for showing and creating a graph in GAns. It supports zooming and
 * other general navigation features.
 * 
 * @author Nicolas
 */
public class GraphView extends Pane {

	DoubleProperty myScale = new SimpleDoubleProperty(1.0);

	/**
	 * Constructor.
	 */
	public GraphView() {
		// setPrefSize(600, 600);
		// setStyle("-fx-background-color: lightgrey;");

		// add scale transform
		scaleXProperty().bind(myScale);
		scaleYProperty().bind(myScale);
	}

	/**
	 * Adds a grid to the GraphView, on which the dragging can be mapped.
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

	/**
	 * Returns the scale on which the GraphView currently is.
	 * 
	 * @return The scale of the GraphView.
	 */
	public double getScale() {
		return myScale.get();
	}

	/**
	 * Sets the scale of the GraphView.
	 * 
	 * @param scale
	 *            The scale of the GraphView.
	 */
	public void setScale(double scale) {
		myScale.set(scale);
	}

	/**
	 * Sets the pivot so the scrolling follows the mouse position on the
	 * GraphView.
	 * 
	 * @param x
	 * @param y
	 */
	public void setPivot(double x, double y) {
		setTranslateX(getTranslateX() - x);
		setTranslateY(getTranslateY() - y);
	}

	/**
	 * Sets a graph. Every element in the graph will be generated and then
	 * shown.
	 * 
	 * @param graph
	 *            The graph to be visualized in the view.
	 */
	public void setGraph(/* IGraph graph */) {
	}

	/**
	 * Adds a single vertex in the GraphView.
	 * 
	 * @param x
	 *            The x position in the view.
	 * @param y
	 *            The y position in the view.
	 * @param Text
	 *            The text of the vertex.
	 */
	public void addVertex(double x, double y, String text) {
		VertexShape test = new VertexShape(text);
		test.relocate(x, y);
		getChildren().add(test);
	}
}
