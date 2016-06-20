package parameter;

import java.util.ArrayList;
import java.util.List;

/**
 * MultipleChoiceParameter are parameters with an predefined String value space.
 */
public class MultipleChoiceParameter extends Parameter<MultipleChoiceParameter, String> {

	private int selected;
	private List<String> values;

	/**
	 * Constructs a new MultipleChoiceParameter, sets its name, its possible
	 * choices and initialized index.
	 * @param name The name of the parameter.
	 * @param choices The choices of the parameter.
	 * @param init The initialized index of the parameter.
	 */
	public MultipleChoiceParameter(String name, List<String> choices, int init) {
		super(name, choices.get(init));
		this.values = choices;
		this.selected = Integer.min(Integer.max(0, init), choices.size() - 1);
	}

	/**
	 * Constructs a new MultipleChoiceParameter and sets its name. The possible
	 * choices and index are set as null.
	 * @param name The name of the parameter.
	 */
	public MultipleChoiceParameter(String name) {
		super(name, "");
		this.values = new ArrayList<String>();
		this.selected = 0;
	}

	/**
	 * Overloads the setValue of GAnsProperty. Sets the String at position
	 * selected in values as the value of the Parameter.
	 * @param selected The position in values that has been selected and will be set as value.
	 */
	public void setValue(int selected) {
		this.selected = selected;
		super.setValue(values.get(selected));
	}

	/**
	 * Returns a list of all set possible choices in the
	 * MultipleChoiceParameter.
	 * @return A list of all set possible choices in the MultipleChoiceParameter.
	 */
	public List<String> getChoices() {
		return values;
	}

	/**
	 * Adds a choice to the MultipleChoiceParameter.
	 * @param choice The choice that will be added.
	 * @param index The index in the list the new choice will be added.
	 */
	public void addChoice(String choice, int index) {
		values.add(index, choice);
	}

	/**
	 * Removes a choice from the MultipleChoiceParameter.
	 * @param index The index in the list of the choice to be removed.
	 */
	public void remove(int index) {
		values.remove(index);
	}

	/**
	 * Returns the index of the currently selected choice.
	 * @return The index of the currently selected choice.
	 */
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
