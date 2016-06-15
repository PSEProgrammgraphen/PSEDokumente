package graphmodel;


/**
 * This vertex interface specifies an vertex.
 * An vertex contains an ID and a name
 *
 */
public interface Vertex {

	/**
	 * Get the name of the vertex
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * Get the ID of the vertex
	 * 
	 * @return 
	 */
	public Integer getID(); 

	/**
	 * Adds Values to FastGraphAccessor
	 * 
	 * @return 
	 */
	public void addToFastGraphAccessor(FastGraphAccessor fga);

	public SerializedVertex serialize();
}
