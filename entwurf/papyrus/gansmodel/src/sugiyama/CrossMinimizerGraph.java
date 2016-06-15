package sugiyama;

import java.util.List;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface CrossMinimizerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	/**
	 * Get the amount of layers.
	 * @return
	 * 		the amount of layers that contain at least one vertex
	 */
	public int getLayerCount();
	
	/**
	 * Swaps the position of two vertices that are on the same layer
	 * 
	 * @param first
	 * 		first vertex to change position with
	 * @param second
	 * 		second vertex to change position with
	 */
	public void swapVertices(V first, V second);
	
	/**
	 * Get the number of vertices which are on a  certain layer
	 * 
	 * @param layerNum
	 * 		the layer number to get the vertex count from
	 * @return
	 * 		the number of vertices which are on this layer
	 */
	public int getVertexCount(int layerNum);
	
	/**
	 * Get the layer from the vertex
	 * 
	 * @param vertex
	 * 		the vertex to get its layer from
	 * @return
	 * 		the layer number from this vertex
	 */
	public int getLayer(V vertex);
	
	/**
	 * Get all vertices from a certain layer.
	 * 
	 * @param layerNum
	 * 		the layer number to get all vertices from
	 * @return
	 * 		a list of all vertices which are on this layer
	 */
	public List<V> getLayer(int layerNum);
	
	/**
	 * Get all layers that contain vertices.
	 * 
	 * @return
	 * 		a list of lists of vertices which are on this layer
	 */
	public List<List<V>> getLayers();
}
