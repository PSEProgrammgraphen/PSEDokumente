package plugin;

import graphmodel.Edge;
import graphmodel.Graph;
import graphmodel.Vertex;
import parameter.Settings;

/**
 * An implementations of LayoutAlgorithm takes a graph.
 * It assigns all vertices absolute coordinates and assigns all edges coordinates, they have to pass through.
 * LayoutAlgorithms can be registered with a {@link LayoutOption} at a {@link LayoutRegister}.
 * 
 * @param <G> the type of directed graph which should be processed
 * @param <V> the type of vertex used in the graph
 * @param <E> the type of edge used in the graph
 */
public interface LayoutAlgorithm<G extends Graph<V, E>, V extends Vertex, E extends Edge<V>> {

	/**
	 * Get the set of parameters for this instance of the algorithm.
	 * 
	 * @return the set of parameters
	 */
	public Settings getSettings();

	/**
	 * Layout the specified Graph.
	 * 
	 * @param graph the graph to layout
	 */
	public void layout(G graph);
}
