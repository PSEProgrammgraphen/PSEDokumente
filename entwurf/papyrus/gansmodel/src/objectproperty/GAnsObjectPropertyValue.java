package objectproperty;

/**
 * A simple generic class made to save the different types of property values.
 * Is being used with {@link GAnsProperty} to treat different kinds of
 * properties in the same way in the GUI.
 * 
 * @author Nicolas
 *
 * @param <T>
 *            The object derived class that sall be stored in the
 *            GAnsObjectPropertyValue.
 */
public class GAnsObjectPropertyValue<T extends Object> {

	private T value;

	/**
	 * Constructor.
	 */
	public GAnsObjectPropertyValue() {
	}

	/**
	 * Constructor which directly sets the value.
	 * 
	 * @param value
	 *            The element which shall be stored in the
	 *            GAnsObjectPropertyValue.
	 */
	public GAnsObjectPropertyValue(T value) {
		this.setValue(value);
	}

	/**
	 * Returns the value.
	 * 
	 * @return The value from the GAnsObjectPropertyValue.
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 * 
	 * @param value
	 *            The value to be set.
	 */
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
