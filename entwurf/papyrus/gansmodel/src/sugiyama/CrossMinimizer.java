package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * This class takes a sugiyama graph and rearranges its vertices on each layer to minimize
 * the amount of edge crossings.
 * 
 * @param <G> the type of directed graph which should be minimized.
 * @param <V> the type of vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */ 
public class CrossMinimizer<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	
	/**
	 * Rearranges vertices in the graph argument in order to remove the amount of crosses of their edges.
	 * 
	 * @param graph input graph
	 */
	public void minimizeCrossings(SugiyamaGraph<G, V, E> graph) { }
}
