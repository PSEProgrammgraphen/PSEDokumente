package gui;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;

/**
 * The StructureView regulates the access and representation of the elements in
 * the StructreView of GAns.
 * 
 * @author Nicolas
 */
public class StructureView extends TreeView<String> {

	private HashMap<Integer, TreeItem<String>> itemMap;

	/**
	 * Constructor.
	 */
	public StructureView() {
		itemMap = new HashMap<Integer, TreeItem<String>>();

		TreeItem<String> root = new TreeItem<String>();
		setRoot(root);
		itemMap.put(-1, root);

		this.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				if (mouseEvent.getClickCount() == 2) {
					TreeItem<String> item = getSelectionModel().getSelectedItem();
					// TODO: Aufruf an die Applikation, die einen neuen Tab
					// öffnet.
				}
			}
		});
	}

	/**
	 * Creates a tree like representation from a given graph and its subgraphs.
	 * Should be called, before calling other methods, because there could be a
	 * dummy root-node in the View.
	 * 
	 * @param graph
	 *            The graph which should be represented.
	 */
	public void showTree(/* IGraph graph */) {
		// Erstellen der TreeItems anhand des übergebenen Graphen in der
		// internen Representation
		TreeItem<String> root = new TreeItem<String>(/* Text des RootGraphen */);
		// Erstellen der Items anhand der Subgraphen von graph.
		setRoot(root);
	}
}
