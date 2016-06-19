package parameter;


/**
 * Created by Sven on 08.06.2016.
 */
public class StringParameter extends Parameter<StringParameter, String> {
    private String value;

    public StringParameter(String name, String value) {
        super(name, value);
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
