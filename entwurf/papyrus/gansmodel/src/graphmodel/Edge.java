package graphmodel;

import graphmodel.Graph.V;
import java.lang.Integer;

/**
 * This edge interface specifies an edge.
 * An edge contains two vertices and needs an ID.
 *
 */
public interface Edge {

	/**
	 * Get the vource vertex of this edge
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
