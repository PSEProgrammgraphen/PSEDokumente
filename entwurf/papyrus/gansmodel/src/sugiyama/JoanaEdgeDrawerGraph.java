package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public class JoanaEdgeDrawerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> extends DirectedGraph<G,V,E> implements EdgeDrawerGraph<G,V,E> {

	@Override
	public E reverseEdge(E edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDummyCount(V source, V target) {
		// TODO Auto-generated method stub
		return 0;
	}

}
