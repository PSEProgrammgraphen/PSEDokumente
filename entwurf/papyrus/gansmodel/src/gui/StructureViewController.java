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
	 * Konstruktor. Setzt die View f�r die der Controller zust�ndig ist.
	 * 
	 * @param view
	 *            Die View f�r die der Controller zust�ndig sein soll.
	 */
	public StructureViewController(TreeView<String> view) {
		this.view = view;
		itemMap = new HashMap<Integer, TreeItem<String>>();

		TreeItem<String> root = new TreeItem<String>();
		view.setRoot(root);
		itemMap.put(-1, root);
	}

	/**
	 * F�gt einen Eintrag in den Baum, unter das Item mit parentId ein. F�r die
	 * parentId -1 wird der RootKnoten eingef�gt.
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
	 * Entfernt den Eintrag mit itemId aus dem Baum. F�r die parentId -1 wird
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
	 * Erstellt eine Baumrepr�sentation aus dem �bergebenen Graph und dessen
	 * Subgraphen. Sollte vor zuerst aufgerufen werden, ansonsten ist in der
	 * View potentiell ein dummy Root-Knoten enthalten um Fehler zu verhindern.
	 * 
	 * @param graph
	 *            Der Graph aus dem die Struktur aufgebaut werden soll.
	 */
	public void createTree(/* IGraph graph */) {
		// Erstellen der TreeItems anhand des �bergebenen Graphen in der
		// internen Representation
		TreeItem<String> root = new TreeItem<String>(/* Text des RootGraphen */);
		// Erstellen der Items anhand der Subgraphen von graph.
		view.setRoot(root);
		view.refresh();
	}
}
