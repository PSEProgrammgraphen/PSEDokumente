package parameter;

/**
 * Created by Sven on 08.06.2016.
 */
public class IntegerParameter extends Parameter<IntegerParameter, Integer> {
    private int value;

    public Integer getValue() {
        return value;
    }

    public IntegerParameter(String name, int value) {
        this.value = value;
        setName(name);
    }

    @Override
    public String valueString() {
        return Integer.toString(value);
    }

    @Override
    public int compareTo(IntegerParameter iw) {
        return this.getValue() - iw.getValue();
    }

	@Override
	public void accept(ParameterVisitor visitor) {
		visitor.visit(this);		
	}
}
