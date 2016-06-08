package de.hehosworld;

/**
 * Created by Sven on 08.06.2016.
 */
public interface Parameter<T, V> extends Comparable<T> {
    public String getName();
    public String valueString();
    public V getValue();

    @Override
    public int compareTo(T o);
}
