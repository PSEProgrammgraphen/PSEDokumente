package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;
/**
 * Takes a graph and assigns every vertex in it a relative height. 
 */
public class LayerAssigning<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	public LayerAssigning() { }
	
	/**
	 * Assigns every vertex in the graph parameter e realtive height.
	 * 
	 * @param graph input graph 
	 */ 
	public void assignLayers(G graph) { }
	
	/**
	 * Reassigns the layer of vertices whose layer is greater than the height parameter.
	 * 
	 * @param height maximum height for vertices
	 */ 
	public void setMaxHeight(int height) { }
	
	/**
	 * Reassigns the layer of vertices in case there are more than the width parameter in one layer.
	 * 
	 * @param width maximum amount of vertices in one layer
	 */ 
	public void setMaxWidth(int width) { }
}
