package parameter;

/**
 * DoubleParameters are parameters with an double value space.
 */
public class DoubleParameter extends Parameter<DoubleParameter, Double> {

	private Double min;
	private Double max;
	
    /**
     * Constructs a new DoubleParameter, sets its name, its default value and boundaries.
     * @param name the name of the parameter
     * @param value the value of the parameter
     * @param min the minimum boundary of the parameter
     * @param max the maximum boundary of the parameter
     */
	public DoubleParameter(String name, Double value, Double min, Double max) {}

	@Override
	public String valueString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(ParameterVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(DoubleParameter o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Returns the minimum boundary.
	 * @return the minimum boundary
	 */
	public double getMin() {
		return min;
	}

	/**
	 * Sets the minimum boundary
	 * @param min the minimum boundary
	 */
	public void setMin(double min) {
		this.min = min;
	}

	/**
	 * Returns the maximum boundary.
	 * @return the maximum boundary
	 */
	public double getMax() {
		return max;
	}

	/**
	 * Sets the maximum boundary
	 * @param min the maximum boundary
	 */
	public void setMax(double max) {
		this.max = max;
	}
}
