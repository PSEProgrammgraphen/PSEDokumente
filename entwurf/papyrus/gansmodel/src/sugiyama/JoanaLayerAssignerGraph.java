package sugiyama;

import java.util.List;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public class JoanaLayerAssignerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> extends DirectedGraph<G,V,E> implements LayerAssignerGraph<G,V,E>{

	@Override
	public void assignToLayer(V vertex, int layerNum) {
		// TODO Auto-generated method stub
		
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

	@Override
	public int getVertexCount(int layerNum) {
		// TODO Auto-generated method stub
		return 0;
	}

}
