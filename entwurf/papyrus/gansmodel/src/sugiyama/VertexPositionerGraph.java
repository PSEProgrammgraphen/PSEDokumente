package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface VertexPositionerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	public int getDeviatingDummiesCount(V source, V target);
	
	public void alignVertex(V vertex);
}
