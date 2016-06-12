package graphmodel;

/**
 * This is an abstract Interface which is used to build a concrete edge.
 * 
 *
 */

public abstract class AbstractEdgeBuilder {

	/**
	 * set the ID of this edge
	 * 
	 * @param id 
	 */
	public abstract void setID(String id);

	/**
	 * set the direction of this edge
	 * 
	 * @param direction 
	 */
	public abstract void setDirection(String direction);

	/**
	 * set source and target vertices of this edge
	 * 
	 * @param source 
	 * @param target 
	 */
	public abstract void newEdge(String source, String target);

	/**
	 * Add optional data to this edge.
	 * The EdgeBuilder needs to decide how to save the value.
	 * 
	 * @param keyname 
	 * @param value 
	 */
	public abstract void addData(String keyname, String value); 

}
