package sugiyama;

/**
 * This interface represents a class that takes a directed graph, as a {@link SugiyamaClass}.
 * It removes dummy vertices and reverses previously reversed edges.
 * Afterwards it assigns every edge points it must run through.
 * 
 * @param <G> the type of the directed graph
 * @param <V> the type of the vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */
public interface IEdgeDrawer {

	/**
	 * Draws the edges from the graph argument and reverses the edges, which have been reversed earlier,
	 * so they have now the correct direction.
	 * 
	 * @param graph the input graph
	 */
	public void drawEdges(IEdgeDrawerGraph graph);
}
