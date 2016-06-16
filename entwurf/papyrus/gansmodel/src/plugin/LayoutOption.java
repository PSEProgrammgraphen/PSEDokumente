package plugin;


import graphmodel.Edge;
import graphmodel.Graph;
import graphmodel.Vertex;
import parameter.Settings;

/**
 * An option for a layout of a specific graph.
 * Workspaces can return these for a specific graph.
 * The client can then decide between one ore more LayoutOptions
 * When selected the layout will be applied to the graph.
 *
 */
public abstract class LayoutOption extends EntryPointOption 
{ 
	/**
	 * This should execute the layout on the graph, which should be
	 * specified on construction, or in beforehand.
	 * The settings, which are accessible over {@code getSettings()} will be used
	 * to instantiate the LayoutAlgorithm.
	 */
	public abstract void applyLayout();
	
	/**
	 * Get the set of parameters for an algorithm of this option.
	 * 
	 * @return the set of parameters
	 */
	public abstract Settings getSettings();
}
