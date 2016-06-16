package sugiyama;

import java.util.List;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface VertexPositionerGraph<G extends DirectedGraph<V, E>, V extends Vertex, E extends DirectedEdge<V>> {
//
//	/**
//	 * Get the amount of dummy vertices that are not in the same column as the most dummy vertices that are in the same column.
//	 * 
//	 * @param source
//	 * 		the source vertex
//	 * @param target
//	 * 		the target vertex
//	 * @return
//	 * 		the amount of deviating dummy vertices
//	 */
//	public int getDeviatingDummiesCount(V source, V target);
//	
//	/**
//	 * Realigns all vertices from a source vertex to the next not dummy vertex in order to set the dummy vertices and the source vertex as good as possible in one column.
//	 * 
//	 * @param source
//	 * 		the source vertex
//	 */
//	public void alignVertex(V source);

	/**
	 * Get the amount of layers.
	 * @return
	 * 		the amount of layers that contain at least one vertex
	 */
	public int getLayerCount();
	
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
	public int getLayer(SugiyamaVertex<V> vertex);
	
	/**
	 * Get all vertices from a certain layer.
	 * 
	 * @param layerN the index of the layer
	 * @return 		 a list of all vertices which are on this layer
	 */
	public List<SugiyamaVertex<V>> getLayer(int layerNum);
	
	/**
	 * Sets the y-coordinate of all vertices on layer Y.
	 * 
	 * @param layerN the index of the layer
	 * @param y 	 the y-coordinate
	 */
	public void setLayerY(int layerN, int y);
	
	
	/**
	 * Sets the x-coordinate of the specified vertex
	 * @param vertex the vertex to position
	 * @param x 	 the x-coordinate
	 */
	public void setX(SugiyamaVertex<V> vertex, int x);
	
}
