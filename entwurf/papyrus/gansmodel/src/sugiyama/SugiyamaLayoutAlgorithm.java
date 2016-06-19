package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;
import plugin.LayoutAlgorithm;

/**
 * This interface supports in addition to Layouts, where every vertex a coordinate and every
 * edge a path is assigned, a Layout which saves the positioning of vertex in the representation of a {@link SugiyamaGraph}.
 * 
 * @param <G> the type of the graph the layout should be applied
 * @param <V> the type of the vertices the graph contains
 * @param <E> the type of the edges the graph contains
 */
public interface SugiyamaLayoutAlgorithm<G extends DirectedGraph<V, E>, V extends Vertex, E extends DirectedEdge<V>> 
	extends LayoutAlgorithm<G, V, E> {

	/**
	 * Applies its layout to a graph as in {@code layout(G graph)} but keeps the notion of layers.
	 * A possible application is drawing of recursive graphs.
	 * @param graph the graph to apply the layout to
	 */
	public void layoutSugiyamaGraph(SugiyamaGraph<G, V, E> graph);
}
