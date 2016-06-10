package gui;

import javafx.scene.layout.Pane;

/**
 * Der Controller f�r eine GraphView von GAns. Der Contoller fungiert zus�tzlich
 * als "GraphEngine", erstellt die einzelnen Knoten und Kanten die Angezeigt
 * werden und bietet Zugriff auf die Objekte (z.B. f�r einen Exporter)
 * 
 * @author Nicolas
 */
public class GraphViewController {

	private Pane view;

	/**
	 * Konstruktor. Setzt die View f�r die der Controller zust�ndig ist.
	 * 
	 * @param view
	 *            Die View f�r die der Controller zust�ndig sein soll.
	 */
	public GraphViewController(Pane view) {
		this.view = view;
	}

	/**
	 * Setzt den Graphen der in der View angezeigt werden soll und erstellt diesen.
	 * 
	 * @param graph Der Graph der in der View dargestellt werden soll.
	 */
	public void setGraph(/* IGraph graph */) {
	}

	//Testfunktion sp�ter private.
	public void setNode(double x, double y, String text) {
		VertexShape test = new VertexShape(text);
		test.relocate(x, y);
		view.getChildren().add(test);
	}

}
