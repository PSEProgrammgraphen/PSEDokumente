package graphmodel;

import graphmodel.Graph.V;
import java.lang.Integer;
public interface Edge {

	/**
	 * 
	 * @return 
	 */
	public V getSource();

	/**
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * 
	 * @return 
	 */
	public V getTarget();

	/**
	 * 
	 * @return 
	 */
	public Integer getID(); 

}
