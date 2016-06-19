package graphmodel;

import java.util.List;

public interface LayeredGraph<V extends Vertex, E extends DirectedEdge<V>> extends DirectedGraph<V, E> {
	
	
	/**
	 * Get the amount of layers.
	 * @return the amount of layers that contain at least one vertex
	 */
	public int getLayerCount();
	
	/**
	 * Get the number of vertices which are on a  certain layer
	 * 
	 * @param layerNum the layer number to get the vertex count from
	 * @return 		   the number of vertices which are on this layer
	 */
	public int getVertexCount(int layerNum);
	
	/**
	 * Get the layer from the vertex
	 * 
	 * @param vertex the vertex to get its layer from
	 * @return  	 the layer number from this vertex
	 */
	public int getLayer(V vertex);
	
	/**
	 * Get all vertices from a certain layer.
	 * 
	 * @param layerN the index of the layer
	 * @return 		 a list of all vertices which are on this layer
	 */
	public List<V> getLayer(int layerNum);
	
	/**
	 * Get all layers that contain vertices.
	 * 
	 * @return a list of lists of vertices which are on this layer
	 */
	public List<List<V>> getLayers();
	
	/**
	 * Returns the height, i.e. the number of layers.
	 * @return the height
	 */
	public int getHeight();
	
	/**
	 * Returns the width of the layer specified by its index, i.e. the number of vertices in the layer.
	 * @param layerN the index of the layer
	 * @return 		 the width of the layer
	 */
	public int getLayerWidth(int layerN);

	/**
	 * Returns the width of the widest layer, i.e. the number of vertices the layer with the most vertices contains.
	 * @return the maximum width 
	 */
	public int getMaxWidth();
	
	/**
	 * Returns the columns the vertex spans.
	 * Default is 1. Compound Vertices can span over multiple columns.
	 * @param vertex the vertex to get the width
	 * @return the width of the vertex
	 */
	public int getWidth(V vertex);

	/**
	 * Returns the layers the vertex spans.
	 * Default is 1. Compound Vertices can span over multiple layers.
	 * @param vertex the vertex to get the height
	 * @return the width of the height
	 */
	public int getHeight(V vertex);
	
}
