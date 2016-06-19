package parameter;

import java.awt.event.ActionListener;
import java.util.List;

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
	
	private List<ActionListener> onChangeListener;
    
    /**
     * Let the visitor visit this parameter.
     * @param visitor
     * 		The visitor to visit
     */
    public abstract void accept(ParameterVisitor visitor);
    
    /**
     * Add a listener who gets triggered when a change of the value occurs.
     * @param listener
     * 		The listener to add
     */
    public void addChangeListener(ActionListener listener) { onChangeListener.add(listener); }

    /**
     * Returns all listener listening to changes of this parameter.
     * @return
     * 		A list of listeners
     */
    protected List<ActionListener> getListener() { return onChangeListener; }

    @Override
    public abstract int compareTo(T o);
}
