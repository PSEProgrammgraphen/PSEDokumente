/**
 * 
 */
package plugin;

import java.util.List;

import graphmodel.Graph;

/**
 * Stores a collection of layouts applicable to a specific subclass of graph.
 * @author Lucas
 */
public interface LayoutRegister<G extends Graph> {
	
	public void addLayoutOption(LayoutOption<G> option);
	public List<LayoutOption<G>>getLayoutOptions();
}
