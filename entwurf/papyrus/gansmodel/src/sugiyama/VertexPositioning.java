package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * This class takes a directed graph and position its vertices in order to look more clearly. (e.g. position vertices in a row or column)
 *
 * @param <G> a directed graph
 * @param <V> a vertex
 * @param <E> a directed edge
 */
public class VertexPositioning <G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	/**
	 * Position all vertices relatively to each other.
	 * 
	 * @param 
	 * 		graph input graph
	 */
	public void positionVertices(G graph) {
	}
}
