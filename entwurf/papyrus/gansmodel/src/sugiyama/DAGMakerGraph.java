package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface DAGMakerGraph<G extends DirectedGraph<V, E>, V extends Vertex, E extends DirectedEdge<V>>{

	/**
	 * Reverses the direction of an directed edge and returns it.
	 * 
	 * @param 
	 * 		edge the edge to return its direction
	 * @return
	 * 		the reversed edge
	 */
	public E reverseEdge(E edge);
	
}
