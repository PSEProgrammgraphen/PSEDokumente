package parameter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * IntegerParameters are parameters with an integer value space.
 */
public class IntegerParameter extends Parameter<IntegerParameter, Integer> {
    private int value;
    private int min;
    private int max;

    /**
     * Returns the current value of the parameter.
     * @return current value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Constructs a new IntegerParameter, sets its name, its default value and boundaries.
     * @param name the name of the parameter
     * @param value the value of the parameter
     * @param min the minimum boundary of the parameter
     * @param max the maximum boundary of the parameter
     */
    public IntegerParameter(String name, int value, int min, int max) {
        this.value = value;
        setName(name);
        this.min = min;
        this.max = max;
    }

    @Override
    public String valueString() {
        return Integer.toString(value);
    }
    
    /**
     * Sets the value of the parameter.
     * Informs all listener about the change.
     * @param value the new value
     */
    public void setValue(int value)
    {
    	this.value = value;
    	for (ActionListener listener: this.getListener())
    	{
    		listener.actionPerformed(new ActionEvent(this, 0, "Value changed"));
    	}
    }

    @Override
    public int compareTo(IntegerParameter iw) {
        return this.getValue() - iw.getValue();
    }

	@Override
	public void accept(ParameterVisitor visitor) {
		visitor.visit(this);		
	}

	/**
	 * Returns the minimum boundary.
	 * @return the minimum boundary
	 */
	public int getMin() {
		return min;
	}

	/**
	 * Sets the minimum boundary
	 * @param min the minimum boundary
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * Returns the maximum boundary.
	 * @return the maximum boundary
	 */
	public int getMax() {
		return max;
	}

	/**
	 * Sets the maximum boundary
	 * @param min the maximum boundary
	 */
	public void setMax(int max) {
		this.max = max;
	}
}
