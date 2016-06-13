package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * Takes a graph and rearranges its vertices.
 */ 
public class CrossMinimizer<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	public CrossMinimizer() { }
	
	/**
	 * Rearranges vertices in the graph argument in order to remove the amount of crosses of their edges.
	 * 
	 * @param graph input graph
	 */ 
	public void minimizeCrossings(G graph ) { }
}
