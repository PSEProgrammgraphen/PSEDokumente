package de.hehosworld;

/**
 * Created by Sven on 08.06.2016.
 */
public class IntegerParameter implements Parameter<IntegerParameter, Integer> {
    private int value;
    private String name;

    public Integer getValue() {
        return value;
    }

    public IntegerParameter(String name, int value) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String valueString() {
        return Integer.toString(value);
    }

    @Override
    public int compareTo(IntegerParameter iw) {
        return this.getValue() - iw.getValue();
    }
}
