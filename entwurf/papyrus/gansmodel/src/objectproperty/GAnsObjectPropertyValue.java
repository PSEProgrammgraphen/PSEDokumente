package objectproperty;

/**
 * Einfache generische Klasse zum Speichern von verschiedenen Typen von
 * Properties. Wird mit {@link GAnsProperty} genutzt um verschiedene Klassen von
 * Eigenschaften in der GUI gleich zu behandeln.
 * 
 * @author Nicolas
 *
 * @param <T>
 *            Objekt das in dem PropertyValue gespeichert werden soll.
 */
public class GAnsObjectPropertyValue<T extends Object> {

	private T value;

	/**
	 * Konstruktor
	 */
	public GAnsObjectPropertyValue() {
	}

	/**
	 * Konstruktor
	 * 
	 * @param value
	 *            Das Element das in dem PropertyValue gespeichert werden soll
	 */
	public GAnsObjectPropertyValue(T value) {
		this.setValue(value);
	}

	/**
	 * Gibt das Value zurück.
	 * 
	 * @return Das Value des PropertyValues.
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Setzt das Value.
	 * 
	 * @param value
	 *            Das zu setzende Value.
	 */
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
