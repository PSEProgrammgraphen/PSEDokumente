package graphmodel;

public abstract class AbstractEdgeBuilder {

	/**
	 * 
	 * @param id 
	 */
	public abstract void setID(String id);

	/**
	 * 
	 * @param direction 
	 */
	public abstract void setDirection(String direction);

	/**
	 * 
	 * @param source 
	 * @param target 
	 */
	public abstract void newEdge(String source, String target);

	/**
	 * 
	 * @param keyname 
	 * @param value 
	 */
	public abstract void addData(String keyname, String value); 

}
