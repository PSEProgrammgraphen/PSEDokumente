package parameter;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceParameter extends Parameter<MultipleChoiceParameter, String> {

	private int selected;
	private List<String> values;

	public MultipleChoiceParameter(String name, List<String> choices, int init) {
		super(name, choices.get(init));
		this.values = choices;
		this.selected = Integer.min(Integer.max(0, init), choices.size() - 1);
	}

	public MultipleChoiceParameter(String name) {
		super(name, "");
		this.values = new ArrayList<String>();
		this.selected = 0;
	}

	/**
	 * Overloads the setValue of GAnsProperty. Sets the String at position
	 * selected in values as the value of the Parameter.
	 * 
	 * @param selected
	 *            The position in values that has been selected and will be set
	 *            as value.
	 */
	public void setValue(int selected) {
		this.selected = selected;
		super.setValue(values.get(selected));
	}

	/**
	 * Returns a list of all set possible choices in the MultipleChoiceParameter.
	 * @return {@link List} of all possible choises
	 */
	public List<String> getChoices() {
		return values;
	}

	public void addChoice(String choice, int index) {
		values.add(index, choice);
	}

	public void remove(int index) {
		values.remove(index);
	}

	public int getSelectionIndex() {
		return selected;
	}

	@Override
	public void accept(ParameterVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int compareTo(MultipleChoiceParameter o) {
		return 0;
	}
}
