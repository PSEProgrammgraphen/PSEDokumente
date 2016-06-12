package objectproperty;

import javafx.beans.property.SimpleObjectProperty;

/**
 * A JavaFX objectproperty which in toString() retuns the value from the
 * toString() of the {@link GAnsObjectPropertyValue}.
 * 
 * @author Nicolas
 */
public class GAnsObjectProperty extends SimpleObjectProperty<GAnsObjectPropertyValue<?>> {

	/**
	 * Constructor.
	 * 
	 * @param bean
	 *            Bean that will be given to the SimpleObjectProperty
	 *            constructor.
	 * @param name
	 *            name that will be given to the SimpleObjectProperty
	 *            constructor.
	 */
	public GAnsObjectProperty(Object bean, String name) {
		super(bean, name);
	}

	@Override
	public String toString() {
		return getValue().toString();
	}
}