package parameter;


import java.util.*;

/**
 * A compound object to store parameters.
 * Created by Sven on 08.06.2016.
 */
public class Settings {
    Map<String, Parameter> parameters;

    public Settings(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Settings() {
        parameters = new HashMap<String, Parameter>();
    }

    public void addParameter(String string, Parameter parameter) {
        this.parameters.put(string, parameter);
    }

    public int size() {
        return parameters.size();
    }

    public boolean isEmpty() {
        return parameters.isEmpty();
    }

    public boolean containsKey(Object key) {
        return parameters.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return parameters.containsValue(value);
    }

    public Parameter get(Object key) {
        return parameters.get(key);
    }

    public Parameter remove(Object key) {
        return parameters.remove(key);
    }

    public Collection<Parameter> values() {
        return parameters.values();
    }

    public Set<Map.Entry<String, Parameter>> entrySet() {
        return parameters.entrySet();
    }
}
