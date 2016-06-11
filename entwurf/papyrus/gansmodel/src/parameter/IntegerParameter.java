package parameter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sven on 08.06.2016.
 */
public class IntegerParameter extends Parameter<IntegerParameter, Integer> {
    private int value;
    private int min;
    private int max;

    public Integer getValue() {
        return value;
    }

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

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}
