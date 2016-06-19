package graphmodel;

import java.util.List;

/**
 * This edge interface specifies an edge.
 * An edge contains two vertices, an ID, a name and a label.
 *
 */
public interface Edge<V extends Vertex> {

	/**
	 * Returns the vertices connected with this edge.
	 * 
	 * @return
	 * 		the vertices connected with the edge
	 */
	public List<V> getVertices();

	/**
	 * Returns the name of the edge.
	 * 
	 * @return
	 * 		name of the edge
	 */
	public String getName();


	/**
	 * Returns the ID of the edge.
	 * 
	 * @return
	 * 		id of the edge
	 */
	public Integer getID(); 
	
	/**
	 * Returns the label of the edge.
	 * 
	 * @return
	 * 		label of the edge
	 */
	public String getLabel(); 


	/**
	 * Adds Values to FastGraphAccessor.
	 * 
	 * @param fga 
	 */
	public void addToFastGraphAccessor(FastGraphAccessor fga);
	
	/**
	 * 
	 * @return
	 */
	public SerializedEdge<V> serialize();
}
