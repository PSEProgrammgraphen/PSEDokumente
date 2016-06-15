package graphmodel;

import java.util.List;

import plugin.LayoutOption;

/**
 * Classes implementing this interface provide a list of LayoutOptions with their
 * target set to itself.
 */
public interface Layoutable {

	/**
	 * Returns a list of layouts which have been registered at the corresponding
	 * LayoutRegister for this graph type.
	 * The graph implementing this interface will be set as target of the LayoutOption.
	 */
	public List<LayoutOption> getRegisteredLayouts();
}
