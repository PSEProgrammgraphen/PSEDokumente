package graphmodel;

/**
 * A interface of a vertex that contains an entire subgraph.
 *
 * @param <G>
 *            Type of graph that is contained in the vertex.
 * @param <V>
 *            Type of vertices in the graph contained in the vertex.
 * @param <E>
 *            Type of edges in the graph contained in the vertex.
 */
public interface CompoundVertex<G extends Graph<V, E>, V extends Vertex, E extends Edge<V>> extends Vertex {

	/**
	 * Returns the graph contained in the vertex.
	 * 
	 * @return The graph contained in the vertex.
	 */
	public G getGraph();
}
