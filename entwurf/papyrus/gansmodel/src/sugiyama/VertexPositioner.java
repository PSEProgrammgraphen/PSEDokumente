package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * This interface represents a class that takes a directed graph and position its vertices in order to look more clearly. (e.g. position vertices in a row or column)
 *
 * @param <G> the type of the directed graph
 * @param <V> the type of the vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */
public interface VertexPositioner<G extends DirectedGraph<G,V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	/**
	 * Position all vertices relatively to each other.
	 * 
	 * @param graph input graph
	 */
	public void positionVertices(G graph);
}
