package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;
/**
 * This class takes a directed graph and assigns every vertex in it a relative height.
 * 
 * @param <G> a directed graph
 * @param <V> a vertex
 * @param <E> a directed edge
 */
public class LayerAssigning<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {
	
	
	/**
	 * Assigns every vertex in the graph parameter e realtive height.
	 * 
	 * @param 
	 * 		graph input graph 
	 */
	public void assignLayers(G graph) { }
	
	/**
	 * Reassigns the layer of vertices whose layer is greater than the height parameter.
	 * 
	 * @param 
	 * 		height maximum height for vertices
	 */
	public void setMaxHeight(int height) { }
	
	/**
	 * Reassigns the layer of vertices in case there are more than the width parameter in one layer.
	 * 
	 * @param 
	 * 		width maximum amount of vertices in one layer
	 */
	public void setMaxWidth(int width) { }
}
