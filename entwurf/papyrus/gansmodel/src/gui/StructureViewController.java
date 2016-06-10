package gui;

import java.util.HashMap;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * Die StructureViewController-Klasse regelt den Zugriff und die Darstellung der
 * Elemente in der StrukturView der GUI von GAns.
 * 
 * @author Nicolas
 */
public class StructureViewController {

	private TreeView<String> view;
	private HashMap<Integer, TreeItem<String>> itemMap;

	/**
	 * Konstruktor. Setzt die View für die der Controller zuständig ist.
	 * 
	 * @param view
	 *            Die View für die der Controller zuständig sein soll.
	 */
	public StructureViewController(TreeView<String> view) {
		this.view = view;
		itemMap = new HashMap<Integer, TreeItem<String>>();

		TreeItem<String> root = new TreeItem<String>();
		view.setRoot(root);
		itemMap.put(-1, root);
	}

	/**
	 * Fügt einen Eintrag in den Baum, unter das Item mit parentId ein. Für die
	 * parentId -1 wird der RootKnoten eingefügt.
	 * 
	 * @param parentId
	 * @param itemId
	 * @param itemText
	 */
	public void addTreeItem(int parentId, int itemId, String itemText) {
		TreeItem<String> item = new TreeItem<String>(itemText);
		itemMap.put(itemId, item);
		itemMap.get(parentId).getChildren().add(item);
		view.refresh();
	}

	/**
	 * Entfernt den Eintrag mit itemId aus dem Baum. Für die parentId -1 wird
	 * der RootKnoten entfernt.
	 * 
	 * @param parentId
	 * @param itemId
	 */
	public void removeTreeItem(int parentId, int itemId) {
		TreeItem<String> item = itemMap.remove(itemId);
		itemMap.get(parentId).getChildren().remove(item);
		view.refresh();
	}

	/**
	 * Erstellt eine Baumrepräsentation aus dem übergebenen Graph und dessen
	 * Subgraphen. Sollte vor zuerst aufgerufen werden, ansonsten ist in der
	 * View potentiell ein dummy Root-Knoten enthalten um Fehler zu verhindern.
	 * 
	 * @param graph
	 *            Der Graph aus dem die Struktur aufgebaut werden soll.
	 */
	public void createTree(/* IGraph graph */) {
		// Erstellen der TreeItems anhand des übergebenen Graphen in der
		// internen Representation
		TreeItem<String> root = new TreeItem<String>(/* Text des RootGraphen */);
		// Erstellen der Items anhand der Subgraphen von graph.
		view.setRoot(root);
		view.refresh();
	}
}
