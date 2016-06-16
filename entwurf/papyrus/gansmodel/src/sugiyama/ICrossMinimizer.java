package sugiyama;

/**
 * This interface represents a class that takes a Sugiyama Graph and rearranges its vertices on each layer to minimize
 * the amount of edge crossings.
 * 
 * @param <G> the type of directed graph which should be minimized.
 * @param <V> the type of vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */ 
public interface ICrossMinimizer {

	
	/**
	 * Rearranges vertices in the graph argument in order to remove the amount of crosses of their edges.
	 * 
	 * @param graph input graph
	 */
	public void minimizeCrossings(ICrossMinimizerGraph graph);
}
