package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public class JoanaDAGMakerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> extends DirectedGraph<G,V,E> implements DAGMakerGraph<G,V,E>{

	@Override
	public E reverseEdge(E edge) {
		// TODO Auto-generated method stub
		return null;
	}

}
