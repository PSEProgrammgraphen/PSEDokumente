package graphmodel;

/**
 * This vertex interface specifies a vertex. Every vertex contains an ID, a
 * name and a label. The ID of a vertex is unique.
 */
public interface Vertex {

	/**
	 * Returns the name of the vertex. A descriptive name of the vertex. Multiple
	 * vertices with equal name in one graph are allowed. Therefore don't use
	 * this as identifier, instead use {@code getID()}.
	 * 
	 * @return the name of the vertex.
	 */
	public String getName();

	/**
	 * Returns the ID of the vertex. Every vertex in one graph has a unique ID.
	 * 
	 * @return the ID of the vertex.
	 */
	public Integer getID();

	/**
	 * Returns the label of the vertex, that will be shown in the GUI. The label can
	 * be an empty string.
	 * 
	 * @return the label of the vertex
	 */
	public String getLabel();

	/**
	 * Returns the X-coordinate of the vertex.
	 * 
	 * @return the X-coordinate of this vertex.
	 */
	public int getX();

	/**
	 * Returns the Y-coordinate of the vertex.
	 * 
	 * @return the Y-coordinate of the vertex.
	 */
	public int getY();

	// TODO: Add JavaDoc below.
	/**
	 * Adds Values to FastGraphAccessor
	 */
	public void addToFastGraphAccessor(FastGraphAccessor fga);

	public SerializedVertex serialize();
}
