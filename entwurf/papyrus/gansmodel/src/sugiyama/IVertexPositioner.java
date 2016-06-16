package sugiyama;

/**
 * This interface represents a class that takes a directed graph and position 
 * its vertices in order to look more clearly. (e.g. position vertices in a row or column)
 * This step has to access the GraphicEngine to get the size of each vertex.
 *
 * @param <G> the type of the directed graph
 * @param <V> the type of the vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */
public interface IVertexPositioner {

	/**
	 * Sets absolute coordinates for every vertex in the graph.
	 * Before this step the vertices are only positioned relatively to each other (layer and order in one layer)
	 * 
	 * @param graph input graph
	 */
	public void positionVertices(IVertexPositionerGraph graph);
}
