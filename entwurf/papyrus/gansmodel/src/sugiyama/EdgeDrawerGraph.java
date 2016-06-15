package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface EdgeDrawerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	public E reverseEdge(E edge);
	
	public int getDummyCount(V source, V target);
}
