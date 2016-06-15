package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface DAGMakerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>>{

	public E reverseEdge(E edge);
	
}
