package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public class JoanaVertexPositionerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> extends DirectedGraph<G,V,E> implements VertexPositionerGraph<G,V,E> {

	@Override
	public int getDeviatingDummiesCount(V source, V target) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void alignVertex(V vertex) {
		// TODO Auto-generated method stub
		
	}

}
