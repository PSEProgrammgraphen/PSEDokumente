package graphmodel;

import java.lang.Integer;
import java.util.List;

/**
 * This edge interface specifies an edge.
 * An edge contains two vertices and needs an ID.
 *
 */
public interface Edge<V extends Vertex> {

	/**
	 * Get the vertices connected with this edge of this edge.
	 * 
	 * @return
	 * 		the vertices connected with this edge
	 */
	public List<V> getVertices();

	/**
	 * Get the name of this Edge.
	 * 
	 * @return
	 * 		name of this edge
	 */
	public String getName();


	/**
	 * Get the ID of this edge.
	 * 
	 * @return
	 * 		id of this edge
	 */
	public Integer getID(); 


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
