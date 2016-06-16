package sugiyama;

/**
 * This interface represents a class that takes a directed graph, as a {@link SugiyamaClass}.
 * It removes dummy vertices and reverses previously reversed edges.
 * Afterwards it assigns every edge points it must run through.
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
