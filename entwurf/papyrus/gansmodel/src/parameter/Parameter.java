package parameter;

/**
 * Created by Sven on 08.06.2016.
 */
public abstract class Parameter<T, V> implements Comparable<T> {
	
	String name;
	
	public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public abstract String valueString();
    public abstract V getValue();
    public abstract void accept(ParameterVisitor visitor);

    @Override
    public abstract int compareTo(T o);
}
