package objectproperty;

import javafx.beans.property.SimpleObjectProperty;

/**
 * Ein JavaFX ObjectProperty welches bei toString() den Wert vom internen
 * GAnsPropertyValue zurückgibt.
 * 
 * @author Nicolas
 */
public class GAnsObjectProperty extends SimpleObjectProperty<GAnsObjectPropertyValue<?>> {

	/**
	 * Konstruktor.
	 * 
	 * @param bean
	 *            Bean das an SimpleObjectProperty übergeben wird.
	 * @param name
	 *            Name der an SimpleObjectProperty übergeben wird.
	 */
	public GAnsObjectProperty(Object bean, String name) {
		super(bean, name);
	}

	@Override
	public String toString() {
		return getValue().toString();
	}
}