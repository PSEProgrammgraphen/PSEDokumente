package sugiyama;

import java.util.List;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public class JoanaCrossMinimizerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> extends DirectedGraph<G,V,E> implements CrossMinimizerGraph<G,V,E> {

	@Override
	public int getLayerCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void swapVertices(V first, V second) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getVertexCount(int layerNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLayer(V vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<V> getLayer(int layerNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<V>> getLayers() {
		// TODO Auto-generated method stub
		return null;
	}

}
