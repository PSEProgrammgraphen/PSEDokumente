package parameter;


/**
 * Created by Sven on 08.06.2016.
 */
public class StringParameter extends Parameter<StringParameter, String> {
    private String value;

    public StringParameter(String name, String value) {
        setName(name);
        this.value = value;
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

	@Override
	public void accept(ParameterVisitor visitor) {
		visitor.visit(this);
	}
}
