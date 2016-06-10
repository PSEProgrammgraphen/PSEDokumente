package parameter;


/**
 * Created by Sven on 08.06.2016.
 */
public class EnumerationParameter<T extends Enum> extends Parameter<EnumerationParameter, T> {
    private T enumeration;

    public EnumerationParameter(String name, T enumeration) {
    	setName(name);
        this.enumeration = enumeration;
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

	@Override
	public void accept(ParameterVisitor visitor) {
		// TODO Auto-generated method stub
		
	}
}
