package gui;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import objectproperty.GAnsProperty;

/**
 * Der Controller f�r die InformationsAnsicht von GAns. Die View wird �ber
 * PropertyValueFactories automatisch aufgebaut, wenn �ber setInformations eine
 * Liste mit Properties �bergeben wird.
 * 
 * @author Nicolas
 */
public class InformationViewController {

	private TableView<GAnsProperty> view;

	/**
	 * Konstruktor. Setzt die View f�r die der Controller zust�ndig ist.
	 * 
	 * @param view
	 *            Die View f�r die der Controller zust�ndig sein soll.
	 */
	public InformationViewController(TableView<GAnsProperty> view) {
		this.view = view;
	}

	/**
	 * Setzt die Informationen die in der InformationView dargestellt werden
	 * sollen. Die �bergebenen Properties werden durch eine interne Factory
	 * automatisch in Tabelleneintr�ge umgewandelt. Die Funktion wird �ber
	 * Listener aus dem Model aufgerufen.
	 * 
	 * @param informations
	 *            Liste mit den {@link GAnsProperty} Elementen die in der
	 *            InformationsView angezeigt werden sollen.
	 */
	public void setInformations(ObservableList<GAnsProperty> informations) {
		view.setItems(informations);
		// Implementation in diesem Stil: (siehe
		// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableView.html)
		TableColumn<GAnsProperty, String> propertyNameCol = new TableColumn<GAnsProperty, String>("Property");
		propertyNameCol.setCellValueFactory(new PropertyValueFactory<GAnsProperty, String>(GAnsProperty.name));
		TableColumn<GAnsProperty, String> propertyValueCol = new TableColumn<GAnsProperty, String>("Value");
		propertyValueCol
				.setCellValueFactory(new PropertyValueFactory<GAnsProperty, String>(GAnsProperty.valueAsString));

		view.getColumns().setAll(propertyNameCol, propertyValueCol);

		view.refresh();
	}
}
