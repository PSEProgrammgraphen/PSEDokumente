package graphmodel;

import java.lang.Integer;

/**
 * This edge interface specifies an edge.
 * An edge contains two vertices and needs an ID.
 *
 */
public interface Edge<V extends Vertex> {

	/**
	 * Get the source vertex of this edge
	 * 
	 * @return 
	 */
	public V getSource();

	/**
	 * Get the name of this Edge
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * Get the target vertex of this edge
	 * 
	 * @return 
	 */
	public V getTarget();

	/**
	 * Get the ID of this edge
	 * 
	 * @return 
	 */
	public Integer getID(); 

}
