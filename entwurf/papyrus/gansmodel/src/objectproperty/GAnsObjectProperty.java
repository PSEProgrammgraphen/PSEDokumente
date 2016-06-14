package objectproperty;

import javafx.beans.property.SimpleObjectProperty;

/**
 * A JavaFX object property which in toString() returns the toString() of the
 * value.
 * 
 * @author Nicolas
 */
public class GAnsObjectProperty<T> extends SimpleObjectProperty<T> {

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