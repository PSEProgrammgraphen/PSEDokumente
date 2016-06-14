package sugiyama;

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
public class LayerAssigning<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {
	
	
	/**
	 * Assigns every vertex in the graph parameter e relative height.
	 * @param graph input graph 
	 * 
	public void assignLayers(SugiyamaGraph<G, V, E> graph) { }
	
	/**
	 * Defines a set of constraints which should be considered by the algorithm.
	 * @param constraints relative layer constraints the algorithm should consider
	 */
	public void addConstraints(Set<LayerConstraint<V>> constraints) {}
	
	/**
	 * Reassigns the layer of vertices whose layer is greater than the height parameter.
	 * @param height maximum height for vertices
	 */
	public void setMaxHeight(int height) { }
	
	/**
	 * Reassigns the layer of vertices in case there are more than the width parameter in one layer.
	 * @param width maximum amount of vertices in one layer
	 */
	public void setMaxWidth(int width) { }
}
