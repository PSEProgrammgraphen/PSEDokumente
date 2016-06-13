package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * This class takes a directed graph and rearranges its vertices.
 * 
 * @param <G> a directed graph
 * @param <V> a vertex
 * @param <E> a directed edge
 */ 
public class CrossMinimizer<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	
	/**
	 * Rearranges vertices in the graph argument in order to remove the amount of crosses of their edges.
	 * 
	 * @param 
	 * 		graph input graph
	 */
	public void minimizeCrossings(G graph ) { }
}
