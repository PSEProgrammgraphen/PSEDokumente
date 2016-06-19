package sugiyama;

import java.util.List;

import graphmodel.DirectedGraph;
import sugiyama.SugiyamaGraphBase.SugiyamaEdge;
import sugiyama.SugiyamaGraphBase.SugiyamaVertex;

public interface IVertexPositionerGraph extends DirectedGraph<SugiyamaVertex, SugiyamaEdge> {

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
	public int getLayer(SugiyamaVertex vertex);
	
	/**
	 * Get all vertices from a certain layer.
	 * 
	 * @param layerN the index of the layer
	 * @return 		 a list of all vertices which are on this layer
	 */
	public List<SugiyamaVertex> getLayer(int layerNum);
	
	
	/**
	 * Returns the height, i.e. the number of layers.
	 * @return the height
	 */
	public int getHeight();
	
	/**
	 * Returns the width of the layer specified by it's index, i.e. the number of vertices in the layer.
	 * @param layerN the index of the layer
	 * @return the width of the layer
	 */
	public int getWidth(int layerN);

	/**
	 * Returns the width of the widest layer, i.e. the number of vertices the layer with the most vertices contains.
	 * @return the maximum width 
	 */
	public int getMaxWidth();
	
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
	public void setX(SugiyamaVertex vertex, int x);

	
}
