package parameter;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceParameter extends Parameter<MultipleChoiceParameter, String> {

	private int selected;
	private List<String> values;

	public MultipleChoiceParameter(String name, List<String> choices, int init) 
	{ 
		setName(name);
		this.values = choices; 
		init = Integer.min(Integer.max(0, init), choices.size());
	}
	public MultipleChoiceParameter(String name) 
	{
		this(name, new ArrayList<String>(), 0);
		}
	@Override
	public String valueString() { return values.get(selected); } 
	@Override
	public String getValue() { return values.get(selected); } 
	public List<String> getChoices() { return values; } 
	public void addChoice(String choice, int index) { values.add(index, choice); } 
	public void remove(int index) { values.remove(index); } 
	@Override
	public void accept(ParameterVisitor visitor) { visitor.visit(this); }
	public int getSelectionIndex() { return selected; }

	@Override
	public int compareTo(MultipleChoiceParameter o) {
		return 0;
	}

}
