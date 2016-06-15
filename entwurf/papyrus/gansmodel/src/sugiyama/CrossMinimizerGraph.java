package sugiyama;

import java.util.List;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface CrossMinimizerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	public int getLayerCount();
	
	public void swapVertices(V first, V second);
	
	public int getVertexCount(int layerNum);
	
	public int getLayer(V vertex);
	
	public List<V> getLayer(int layerNum);
	
	public List<List<V>> getLayers();
}
