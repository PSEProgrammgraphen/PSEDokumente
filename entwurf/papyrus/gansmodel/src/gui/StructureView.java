package gui;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;

/**
 * Die StructureView-Klasse regelt den Zugriff und die Darstellung der
 * Elemente in der StrukturView der GUI von GAns.
 * 
 * @author Nicolas
 */
public class StructureView extends TreeView<String> {

	private HashMap<Integer, TreeItem<String>> itemMap;

	/**
	 * Konstruktor. Setzt die View f�r die der Controller zust�ndig ist.
	 * 
	 * @param view
	 *            Die View f�r die der Controller zust�ndig sein soll.
	 */
	public StructureView() {
		itemMap = new HashMap<Integer, TreeItem<String>>();

		TreeItem<String> root = new TreeItem<String>();
		setRoot(root);
		itemMap.put(-1, root);
		
		this.setOnMouseClicked(new EventHandler<MouseEvent>() {
		    @Override
		    public void handle(MouseEvent mouseEvent)
		    {            
		        if(mouseEvent.getClickCount() == 2) {
		            TreeItem<String> item = getSelectionModel().getSelectedItem();
		            //TODO: Aufruf an die Applikation, die einen neuen Tab �ffnet.
		        }
		    }
		});
	}

	/**
	 * Erstellt eine Baumrepr�sentation aus dem �bergebenen Graph und dessen
	 * Subgraphen. Sollte vor zuerst aufgerufen werden, ansonsten ist in der
	 * View potentiell ein dummy Root-Knoten enthalten um Fehler zu verhindern.
	 * 
	 * @param graph
	 *            Der Graph aus dem die Struktur aufgebaut werden soll.
	 */
	public void showTree(/* IGraph graph */) {
		// Erstellen der TreeItems anhand des �bergebenen Graphen in der
		// internen Representation
		TreeItem<String> root = new TreeItem<String>(/* Text des RootGraphen */);
		// Erstellen der Items anhand der Subgraphen von graph.
		setRoot(root);
	}
}
