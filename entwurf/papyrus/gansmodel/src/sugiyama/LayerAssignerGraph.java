package sugiyama;

import java.util.List;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface LayerAssignerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {
	
	/**
	 * Assigns a vertex to a certain layer represented by a number.
	 * 
	 * @param vertex
	 * 		the vertex to assign to a layer
	 * @param layerNum
	 * 		the layer number to assign a vertex to
	 */
	public void assignToLayer(V vertex, int layerNum);
	
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
	
	/**
	 * Get the number of vertices which are on a  certain layer
	 * 
	 * @param layerNum
	 * 		the layer number to get the vertex count from
	 * @return
	 * 		the number of vertices which are on this layer
	 */
	public int getVertexCount(int layerNum);
}
