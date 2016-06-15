package sugiyama;

import java.util.Set;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;
/**
 * This class takes a directed graph and assigns every vertex in it a layer.
 * 
 * @param <G> the type of the directed graph
 * @param <V> the type of the vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */
public class JoanaLayerAssigner<G extends DirectedGraph<V, E>, V extends Vertex, E extends DirectedEdge<V>> implements LayerAssigner<G,V,E>{

	@Override
	public void assignLayers(G graph) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addConstraints(Set<LayerConstraint<V>> constraints) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaxHeight(int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaxWidth(int width) {
		// TODO Auto-generated method stub
		
	}
	
	
}
