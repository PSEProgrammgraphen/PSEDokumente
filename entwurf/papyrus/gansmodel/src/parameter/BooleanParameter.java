package parameter;

/**
 * DoubleParameters are parameters with an double value space.
 */
public class BooleanParameter extends Parameter<BooleanParameter, Boolean> {
	
	private boolean value;

	/**
     * Constructs a new BooleanParameter, sets its name and its default value.
	 * @param name 	the name of the parameter
	 * @param value the value of the parameter
	 */
	public BooleanParameter(String name, boolean value) {}

	@Override
	public String valueString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(ParameterVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(BooleanParameter o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Sets the value of the parameter.
	 * @param value the new value
	 */
	public void setValue(Boolean value) {}
}
