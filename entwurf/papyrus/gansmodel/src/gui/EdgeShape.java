package gui;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 * A visual representation of an edge with a text.
 * 
 * @author Nicolas
 */
public class EdgeShape extends GAnsGraphElement {

	private Line line;
	private Text text;

	/**
	 * Constructor.
	 * 
	 * @param vertex1
	 *            First of the two vertices that shall be connected.
	 * @param vertex2
	 *            Second of the two vertices that shall be connected.
	 */
	public EdgeShape(VertexShape vertex1, VertexShape vertex2) {
		// TODO: Find more beautiful way
		double y1 = vertex1.getLayoutY();
		double x1 = vertex1.getLayoutX();
		double y2 = vertex2.getLayoutY();
		double x2 = vertex2.getLayoutX();

		double startY;
		double startX;
		double endY;
		double endX;

		if (y1 > y2) {
			startY = y1 + vertex1.getHeight();
			startX = x1 + (vertex1.getWidth() * 0.5);

			endY = y2;
			endX = x2 + (vertex2.getWidth() * 0.5);

		} else if (y1 < y2) {
			startY = y2 + vertex1.getHeight();
			startX = x2 + (vertex1.getWidth() * 0.5);

			endY = y1;
			endX = x1 + (vertex2.getWidth() * 0.5);

		} else /* same height */ {
			if (x1 > x2) {
				startY = y1 + (vertex1.getHeight() * 0.5);
				startX = x1;

				endY = y2 + (vertex2.getHeight() * 0.5);
				endX = x2 + vertex2.getWidth();
			} else {
				startY = y1 + (vertex1.getHeight() * 0.5);
				startX = x1 + vertex1.getWidth();

				endY = y2 + (vertex2.getHeight() * 0.5);
				;
				endX = x2;
			}
		}

		this.line = new Line(startX, startY, endX, endY);
		this.text = new Text();

		getChildren().addAll(this.line, this.text);
	}

	/**
	 * Constructor
	 * 
	 * @param vertex1
	 *            First of the two vertices that shall be connected.
	 * @param vertex2
	 *            Second of the two vertices that shall be connected.
	 * @param text
	 *            Text that will be displayed on the edge.
	 */
	public EdgeShape(VertexShape vertex1, VertexShape vertex2, String text) {
		this(vertex1, vertex2);

		setText(text);
	}

	@Override
	public void setText(String text) {
		this.text.setText(text);
		// TODO: Text passend alignen
	}

	@Override
	public String getText() {
		return text.getText();
	}

	@Override
	public void setColor(Color color) {
		line.setFill(color);
	}
}
