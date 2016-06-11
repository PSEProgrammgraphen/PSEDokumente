package parameter;

import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by Sven on 08.06.2016.
 */
public abstract class Parameter<T, V> implements Comparable<T> {
	
	String name;
	List<ActionListener> onChangeListener;
	
	public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public abstract String valueString();
    public abstract V getValue();
    public abstract void accept(ParameterVisitor visitor);
    public void addChangeListener(ActionListener listener) { onChangeListener.add(listener); }

    @Override
    public abstract int compareTo(T o);
}
