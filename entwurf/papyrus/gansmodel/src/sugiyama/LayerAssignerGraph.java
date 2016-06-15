package sugiyama;

import java.util.List;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface LayerAssignerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	public void assignToLayer(V vertex, int layerNum);
	
	public int getLayer(V vertex);
	
	public List<V> getLayer(int layerNum);
	
	public List<List<V>> getLayers();
	
	public int getVertexCount(int layerNum);
}
