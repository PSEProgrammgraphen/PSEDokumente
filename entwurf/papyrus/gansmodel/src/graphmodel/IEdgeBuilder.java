package graphmodel;

/**
 * This is an abstract Interface which is used to build a concrete edge.
 * 
 *
 */

public interface IEdgeBuilder {

	/**
	 * sets the ID of the edge build by this.
	 * 
	 * @param id value to which the id is set
	 */
	public abstract void setID(String id);

	/**
	 * sets the direction of the edge build by this.
	 * 
	 * @param direction String representation of the direction. Can be one of
	 * @TODO
	 */
	public abstract void setDirection(String direction);

	/**
	 * sets source and target vertices of the edge build by this.
	 *
	 * @param source String represantation of the source vertex
	 * @param target String represantation of the target vertex
	 */
	public abstract void newEdge(String source, String target);

	/**
	 * Adds additional data to this edge.
	 * The specific EdgeBuilder implementation needs to decide how to save the value for given edge type.
	 * 
	 * @param keyname 
	 * @param value 
	 */
	public abstract void addData(String keyname, String value); 

}
