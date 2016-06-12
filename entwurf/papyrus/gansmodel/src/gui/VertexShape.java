package gui;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * A graphical representation of a node with a text inside of it.
 * 
 * @author Nicolas
 */
public class VertexShape extends StackPane {

	private Rectangle rectangle;
	private Text text;
	private static double mindWidth = 20;
	private static double mindHeight = 5;

	/**
	 * Constructor
	 */
	public VertexShape() {
		rectangle = new Rectangle(mindWidth, mindHeight);
		rectangle.setFill(Color.GREEN);
		text = new Text();

		getChildren().addAll(rectangle, text);
	}

	/**
	 * Constructor which directly sets the text.
	 * 
	 * @param text
	 *            The text that will be displayed in the vertex.
	 */
	public VertexShape(String text) {
		this();

		setText(text);
	}

	/**
	 * Sets the text and adjusts the size of the rectangle to the size of the
	 * text.
	 * 
	 * @param text
	 *            The text that will be displayed in the vertex.
	 */
	public void setText(String text) {
		this.text.setText(text);
		double width = this.text.getLayoutBounds().getWidth() + 8;
		double height = this.text.getLayoutBounds().getHeight() + 4;

		if (width < mindWidth)
			width = mindWidth;
		if (height < mindHeight)
			height = mindHeight;

		rectangle.setWidth(width);
		rectangle.setHeight(height);
	}

	/**
	 * Returns the text shown in the vertex.
	 * 
	 * @return The text that is being displayed in the vertex.
	 */
	public String getText() {
		return this.text.getText();
	}

	/**
	 * Sets the color of the vertex
	 * 
	 * @param color
	 *            The color the vertex will be.
	 */
	public void setColor(Color color) {
		rectangle.setFill(color);
	}

}
