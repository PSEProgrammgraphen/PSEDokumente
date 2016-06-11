package parameter;

import java.awt.event.ActionListener;
import java.util.List;

/**
 * An abstract parameter class.
 * Created by Sven on 08.06.2016.
 */
public abstract class Parameter<T, V> implements Comparable<T> {
	
	private String name;
	private List<ActionListener> onChangeListener;
	
	/**
	 * Sets the name of the parameter.
	 * @param name
	 * 		The new name to set
	 */
	public void setName(String name) {this.name = name;}
	
	/**
	 * Returns the name of the parameter.
	 * @return
	 * 		The name of the parameter
	 */
    public String getName() {return name;}
    
    /**
     * Returns the value of the parameter as a string.
     * @return
     * 		The value as a string
     */
    public abstract String valueString();
    
    /**
     * Returns the value of the parameter.
     * @return
     * 		The current value of the parameter
     */
    public abstract V getValue();
    
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
