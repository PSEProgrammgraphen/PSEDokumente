package objectproperty;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// Implementation �hnlich wie im Beispiel "Person" bei https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableView.html

/**
 * Eine Eigenschaft eines Knoten oder einer Kante in GAns. Der Name und
 * {@link GAnsObjectPropertyValue} der Eigenschaft wird in JavaFX-Properties
 * gespeichert und dar�ber auch zugriff f�r die GUI gew�hrt. Das Model von GAns
 * besteht aus Knoten und Kanten welche GAnsProperties beinhalten, welche mit
 * der GUI gekoppelt sind.
 * 
 * @author Nicolas
 */
public class GAnsProperty {

	/**
	 * String �ber den von der GUI aus, Factories oder �nliches, auf den
	 * Namen/Bezeichner des Values verwiesen werden kann.
	 */
	public final static String name = "propertyName";

	/**
	 * String �ber den von der GUI aus, Factories oder �nliches, auf den Value
	 * verwiesen werden kann.
	 */
	public final static String value = "propertyValue";

	/**
	 * String �ber den von der GUI aus, Factories oder �nliches, auf die
	 * Stringrepr�sentation des Values verwiesen werden kann.
	 */
	public final static String valueAsString = "propertyValueAsString";

	private StringProperty propertyName;
	private GAnsObjectProperty propertyValue;
	private StringProperty propertyValueAsString;

	/**
	 * Stellt sicher das die Property die den Namen/Bezeichner der GAnsProperty
	 * enth�lt nie null ist und immer mit dem passenden Namen erstellt wird.
	 * 
	 * @return Die StringProperty die den Namen/Bezeichner der GAnsProperty
	 *         enth�lt.
	 */
	public StringProperty propertyNameProperty() {
		if (propertyName == null)
			propertyName = new SimpleStringProperty(this, name);
		return propertyName;
	}

	/**
	 * Stellt sicher das die Property die den {@link GAnsObjectPropertyValue} der
	 * GAnsProperty enth�lt nie null ist und immer mit dem passenden Namen
	 * erstellt wird.
	 * 
	 * @return Die Property die den {@link GAnsObjectPropertyValue} der GAnsProperty
	 *         enth�lt.
	 */
	public GAnsObjectProperty propertyValue() {
		if (propertyValue == null)
			propertyValue = new GAnsObjectProperty(this, value);
		return propertyValue;
	}

	/**
	 * Stellt sicher das die Property die den {@link GAnsObjectPropertyValue} der
	 * GAnsProperty als String enth�lt nie null ist und immer mit dem passenden
	 * Namen erstellt wird.
	 * 
	 * @return Die StringProperty die den {@link GAnsObjectPropertyValue} der
	 *         GAnsProperty als String enth�lt.
	 */
	public StringProperty propertyValueAsString() {
		if (propertyValueAsString == null) {
			propertyValueAsString = new SimpleStringProperty(this, valueAsString);
		}
		return propertyValueAsString;
	}

	/**
	 * Setzt den Namen/Bezeichner der GAnsProperty.
	 * 
	 * @param value
	 *            Der String der als Name der GAnsProperty gesetzt werden soll.
	 */
	public void setPropertyName(String value) {
		propertyNameProperty().set(value);
	}

	/**
	 * Gibt den Namen/Bezeichner der GAnsProperty zur�ck.
	 * 
	 * @return Der Name/Bezeichner der GAnsProperty.
	 */
	public String getPropertyName() {
		return propertyNameProperty().get();
	}

	/**
	 * Setzt das {@link GAnsObjectPropertyValue} und die Stringrepr�sentation des
	 * Werts der GAnsProperty.
	 * 
	 * @param value
	 *            Der {@link GAnsObjectPropertyValue} der GAnsProperty die gesetzt
	 *            werden soll.
	 */
	public void setPropertyValue(GAnsObjectPropertyValue<?> value) {
		propertyValue().setValue(value);
		propertyValueAsString().set(value.toString());
	}

	/**
	 * Gibt das den {@link GAnsObjectPropertyValue} der GAnsProperty zur�ck.
	 * 
	 * @return Der {@link GAnsObjectPropertyValue} der GAnsProperty.
	 */
	public GAnsObjectPropertyValue<?> getPropertyValue() {
		return propertyValue().getValue();
	}

	/**
	 * Gibt die Stringrepr�sentation des {@link GAnsObjectPropertyValue} der
	 * GAnsProperty zur�ck.
	 * 
	 * @return Die Stringrepr�sentation des {@link GAnsObjectPropertyValue} der
	 *         GAnsProperty.
	 */
	public String getPropertyValueAsString() {
		return propertyValueAsString().toString();
	}
}
