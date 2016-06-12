package objectproperty;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// Implementation ähnlich wie im Beispiel "Person" bei https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableView.html

/**
 * The GAnsProperty is a single property of a vertex or an edge in GAns. The
 * name and {@link GAnsObjectPropertyValue} of the property are being stored in
 * JavaFX-Properties. The model consists out of vertices and edges which contain
 * GAnsProperties, which are linked to the GUI-elements.
 * 
 * @author Nicolas
 */
public class GAnsProperty {

	/**
	 * A string with whoom, factories or other elements from the GUI, can
	 * reference to the name/identifier of the value.
	 */
	public final static String name = "propertyName";

	/**
	 * A string with whoom, factories or other elements from the GUI, can
	 * reference to the value. String über den von der GUI aus, Factories oder
	 * Änliches, auf den Value verwiesen werden kann.
	 */
	public final static String value = "propertyValue";

	/**
	 * A string with whoom, factories or other elements from the GUI, can
	 * reference to the string-representation of the value.
	 */
	public final static String valueAsString = "propertyValueAsString";

	private StringProperty propertyName;
	private GAnsObjectProperty propertyValue;
	private StringProperty propertyValueAsString;

	/**
	 * Ensures that the property which contains the name/identifier of the
	 * GAnsProperty is not null and always set with the right name.
	 * 
	 * @return The StringProperty which contains the name/identifier of the
	 *         GAnsProperty.
	 */
	public StringProperty propertyNameProperty() {
		if (propertyName == null)
			propertyName = new SimpleStringProperty(this, name);
		return propertyName;
	}

	/**
	 * Ensures that the property which contains the
	 * {@link GAnsObjectPropertyValue} in the GAnsProperty is not null and
	 * always set with the right name.
	 * 
	 * @return The property which contains the {@link GAnsObjectPropertyValue}
	 *         in the GAnsProperty.
	 */
	public GAnsObjectProperty propertyValue() {
		if (propertyValue == null)
			propertyValue = new GAnsObjectProperty(this, value);
		return propertyValue;
	}

	/**
	 * Ensures that the property which contains the string-representation of the
	 * {@link GAnsObjectPropertyValue} in the GAnsProperty is not null and
	 * always set with the right name.
	 * 
	 * @return The StringProperty which contains the string-representation of
	 *         the {@link GAnsObjectPropertyValue} in the GAnsProperty.
	 */
	public StringProperty propertyValueAsString() {
		if (propertyValueAsString == null) {
			propertyValueAsString = new SimpleStringProperty(this, valueAsString);
		}
		return propertyValueAsString;
	}

	/**
	 * Sets the name/identifier of the GAnsProperty.
	 * 
	 * @param value
	 *            The string which shall be set as the name of the GAnsProperty.
	 */
	public void setPropertyName(String value) {
		propertyNameProperty().set(value);
	}

	/**
	 * Returns the name/identifier of the GAnsProperty.
	 * 
	 * @return The name/identifier of the GAnsProperty.
	 */
	public String getPropertyName() {
		return propertyNameProperty().get();
	}

	/**
	 * Sets the {@link GAnsObjectPropertyValue} and its string-representation of
	 * the GAnsProperty.
	 * 
	 * @param value
	 *            The {@link GAnsObjectPropertyValue} which shall be set in the
	 *            GAnsProperty.
	 */
	public void setPropertyValue(GAnsObjectPropertyValue<?> value) {
		propertyValue().setValue(value);
		propertyValueAsString().set(value.toString());
	}

	/**
	 * Returns the {@link GAnsObjectPropertyValue} of the GAnsProperty.
	 * 
	 * @return The {@link GAnsObjectPropertyValue} of the GAnsProperty.
	 */
	public GAnsObjectPropertyValue<?> getPropertyValue() {
		return propertyValue().getValue();
	}

	/**
	 * Returns the string-representation of the {@link GAnsObjectPropertyValue}
	 * from the GAnsProperty.
	 * 
	 * @return The string-representation of the {@link GAnsObjectPropertyValue}
	 *         from the GAnsProperty.
	 */
	public String getPropertyValueAsString() {
		return propertyValueAsString().toString();
	}
}
