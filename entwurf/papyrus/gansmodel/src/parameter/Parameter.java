package parameter;

import objectproperty.GAnsProperty;

/**
 * An abstract parameter class.
 * A Parameter contains a value and a name. The value can be transformed into a string.
 * Clients can set Listeners to track changes of the value.
 * Classes inheriting from this class can visited by a ParameterVisitor.
 */
public abstract class Parameter<T, V extends Object> extends GAnsProperty<V> implements Comparable<T> {
	
	public Parameter(String name, V value) {
		super(name, value);
	}
    
    /**
     * Let the visitor visit this parameter.
     * @param visitor The visitor to visit
     */
    public abstract void accept(ParameterVisitor visitor);

    @Override
    public abstract int compareTo(T o);
}
