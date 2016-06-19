package sugiyama;


import graphmodel.LayeredGraph;
import sugiyama.SugiyamaGraph.SugiyamaEdge;
import sugiyama.SugiyamaGraph.SugiyamaVertex;

public interface ILayerAssignerGraph extends LayeredGraph<SugiyamaVertex, SugiyamaEdge> {
	
	/**
	 * Assigns a vertex to a certain layer represented by a number.
	 * 
	 * @param vertex   the vertex to assign to a layer
	 * @param layerNum the layer number to assign a vertex to
	 */
	public void assignToLayer(SugiyamaVertex vertex, int layerNum);
	
	/**
	 * Get the layer from the vertex
	 * 
	 * @param vertex the vertex to get its layer from
	 * @return 		 the layer number from this vertex
	 */
	public int getLayer(SugiyamaVertex vertex);
	
	
	/**
	 * Get the number of vertices which are on a  certain layer
	 * 
	 * @param layerNum the layer number to get the vertex count from
	 * @return         the number of vertices which are on this layer
	 */
	public int getVertexCount(int layerNum);
}
