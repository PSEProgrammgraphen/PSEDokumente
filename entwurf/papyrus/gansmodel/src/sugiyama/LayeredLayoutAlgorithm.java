/**
 * 
 */
package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.Graph;
import graphmodel.LayeredGraph;
import graphmodel.Vertex;
import plugin.LayoutAlgorithm;

/**
 * A layout algorithm which is able to apply Layouts while keeping the notion of layers in addition to layout regular graphs.
 */
public interface LayeredLayoutAlgorithm<G extends Graph<V, E>, V extends Vertex, E extends DirectedEdge<V>> extends LayoutAlgorithm<G, V, E> {

	/**
	 * Applies its layout to a graph as in {@code layout(G graph)} but keeps the notion of layers.
	 * The algorithm will assign every vertex a coordinate and every edge a path.
	 * Additionally every vertex will be assigned a position in a layer in the LayeredGraph.
	 * A possible application is drawing of recursive graphs.
	 * @param graph the graph to apply the layout to
	 */
	public void layoutLayeredGraph(LayeredGraph<V, E> graph);

}
