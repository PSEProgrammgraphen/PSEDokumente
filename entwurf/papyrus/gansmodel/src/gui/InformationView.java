package gui;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import objectproperty.GAnsProperty;

/**
 * The InformationView shows a given set of properties from the selected
 * vertices in the {@link GraphView}.
 * 
 * @author Nicolas
 */
public class InformationView extends TableView<GAnsProperty> {

	/**
	 * Sets the properties which should be shown in the InformationView. The
	 * {@link GAnsProperty} are being processed in an internal factory, which
	 * automatically creates the tablecells. The function will be called
	 * whenever the selection of the {@link GraphView} changes.
	 * 
	 * @param informations
	 *            List with {@link GAnsProperty} elements which define the
	 *            content of the InformationView
	 */
	public void setInformations(ObservableList<GAnsProperty> informations) {
		setItems(informations);
		// Implementation in diesem Stil: (siehe
		// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableView.html)
		TableColumn<GAnsProperty, String> propertyNameCol = new TableColumn<GAnsProperty, String>("Property");
		propertyNameCol.setCellValueFactory(new PropertyValueFactory<GAnsProperty, String>(GAnsProperty.name));
		TableColumn<GAnsProperty, String> propertyValueCol = new TableColumn<GAnsProperty, String>("Value");
		propertyValueCol
				.setCellValueFactory(new PropertyValueFactory<GAnsProperty, String>(GAnsProperty.valueAsString));

		getColumns().setAll(propertyNameCol, propertyValueCol);

		//refresh();
	}

}
