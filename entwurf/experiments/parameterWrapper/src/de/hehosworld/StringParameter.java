package de.hehosworld;

/**
 * Created by Sven on 08.06.2016.
 */
public class StringParameter implements Parameter<StringParameter, String> {
    private String name;
    private String value;

    public StringParameter(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String valueString() {
        return this.value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public int compareTo(StringParameter o) {
        return this.value.compareTo(o.getValue());
    }
}
