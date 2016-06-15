package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface EdgeDrawerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {
	
	/**
	 * Reverses the direction of an directed edge and returns it.
	 * 
	 * @param 
	 * 		edge the edge to return its direction
	 * @return
	 * 		the reversed edge
	 */
	public E reverseEdge(E edge);
	
	/**
	 * Get the amount of dummy vertices that exist between two vertices.
	 * 
	 * @param source
	 * 		the source vertex
	 * @param target
	 * 		the target vertex
	 * @return
	 * 		the amount of dummy vertices between two vertices
	 */
	public int getDummyCount(V source, V target);
}
