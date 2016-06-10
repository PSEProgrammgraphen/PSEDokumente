package gui;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * Eine grafische Repräsentation eines Knotens in dem ein Text stehen kann.
 * 
 * @author Nicolas
 */
public class VertexShape extends StackPane {

	private Rectangle rectangle;
	private Text text;
	private static double mindWidth = 20;
	private static double mindHeight = 5;

	/**
	 * Konstruktor
	 */
	public VertexShape() {
		rectangle = new Rectangle(mindWidth, mindHeight);
		rectangle.setFill(Color.GREEN);
		text = new Text();

		getChildren().addAll(rectangle, text);
	}

	/**
	 * Konstruktor der direkt den Text setzt.
	 * 
	 * @param text
	 *            Der Text der in dem Rechteck angezeigt werden soll.
	 */
	public VertexShape(String text) {
		this();

		setText(text);
	}

	/**
	 * Setzt den Text und passt die Größe des Rechtecks an die Größe des Texts
	 * an.
	 * 
	 * @param text
	 *            Der Text der in dem Rechteck angezeigt werden soll.
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
	 * Gibt den Text des Rechtecks zurück.
	 * 
	 * @return Der Text der in der Vertex angezeigt wird.
	 */
	public String getText() {
		return this.text.getText();
	}

	/**
	 * Setzt die Farbe des Rechtecks.
	 * 
	 * @param color
	 *            Die Farbe die das Rechteck haben soll.
	 */
	public void setColor(Color color) {
		rectangle.setFill(color);
	}

}
