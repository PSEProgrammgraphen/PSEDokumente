package plugin;

import graphmodel.Graph;
import parameter.Settings;

public interface LayoutAlgorithm<G extends Graph> {

	/**
	 * 
	 */
	public void getParameterDialog();

	/**
	 * Get the set of parameters for this instance of the algorithm.
	 * @return 
	 * 		The set of parameters
	 */
	public Settings getSettings();

	/**
	 * Layout the specified Graph.
	 * @param graph
	 * 		The graph to layout
	 */
	public void layout(G graph);
	
	/**
	 * Get the full name of the layout.
	 * @return
	 * 		The full name of the layout.
	 */
	public String getName();
	
	/**
	 * Get a acronym of the layout.
	 * @return
	 * 		The acronym of the layout.
	 */
	public String getID();
	
	/**
	 * Register at LayoutAlgorithm for all supported Graphs
	 */
	public void onLoad();
}
