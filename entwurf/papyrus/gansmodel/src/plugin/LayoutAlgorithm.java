package plugin;

import graphmodel.Edge;
import graphmodel.Graph;
import graphmodel.Vertex;
import parameter.Settings;

public interface LayoutAlgorithm<G extends Graph<V, E>, V extends Vertex, E extends Edge<V>> {

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
}
