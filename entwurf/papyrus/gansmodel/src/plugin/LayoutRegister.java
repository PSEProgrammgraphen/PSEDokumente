/**
 * 
 */
package plugin;

import java.util.List;

import graphmodel.Edge;
import graphmodel.Graph;
import graphmodel.Vertex;

/**
 * Stores a collection of layouts.
 * This 
 */
public interface LayoutRegister {
	
	public void addLayoutOption(LayoutOption option);
	public List<LayoutOption> getLayoutOptions();
}
