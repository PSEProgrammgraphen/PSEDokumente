package graphmodel;


/**
 * This vertex interface specifies a vertex.
 * Every vertex contains an ID and a name.
 * The ID of a vertex is unique.
 */
public interface Vertex {

	/**
	 * Get the name of the vertex
	 * A descriptive name of the vertex.
	 * Multiple vertices with equal name in one graph are allowed.
	 * Therefore don't use this as identifier, instead use {@code getID()}.
	 * 
	 * @return the name of the vertex
	 */
	public String getName();

	/**
	 * Get the ID of the vertex.
	 * Every vertex in one graph has a unique ID
	 * 
	 * @return the ID of the vertex
	 */
	public Integer getID();

	// TODO: Add JavaDoc below.
	/**
	 * Adds Values to FastGraphAccessor
	 */
	
	/**
	 * Get the X-coordinate of the vertex.
	 * 
	 * @return the X-coordinate of this vertex
	 */
	public int getX();
	
	/**
	 * Get the Y-coordinate of the vertex.
	 * 
	 * @return the Y-coordinate of the vertex
	 */
	public int getY();
	
	public void addToFastGraphAccessor(FastGraphAccessor fga);

	public SerializedVertex serialize();
}
