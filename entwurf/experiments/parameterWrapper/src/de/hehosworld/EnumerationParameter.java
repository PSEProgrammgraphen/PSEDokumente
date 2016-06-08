package de.hehosworld;

/**
 * Created by Sven on 08.06.2016.
 */
public class EnumerationParameter<T extends Enum> implements Parameter<EnumerationParameter, T> {
    private String name;
    private T enumeration;

    public EnumerationParameter(String name, T enumeration) {
        this.name = name;
        this.enumeration = enumeration;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String valueString() {
        return enumeration.toString();
    }

    @Override
    public T getValue() {
        return enumeration;
    }

    @Override
    public int compareTo(EnumerationParameter o) {
        return enumeration.compareTo(o.getValue());
    }
}
