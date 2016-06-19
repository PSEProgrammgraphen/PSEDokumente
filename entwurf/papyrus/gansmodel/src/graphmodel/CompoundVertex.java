package graphmodel;

/**
 * A interface of a vertex that contains an entire subgraph.
 *
 */
public interface CompoundVertex extends Vertex {

	/**
	 * Returns the graph contained in the vertex.
	 * 
	 * @return The graph contained in the vertex.
	 */
	public Graph getGraph();
}
