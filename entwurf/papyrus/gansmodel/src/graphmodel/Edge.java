package graphmodel;

import java.util.List;
import java.util.Map.Entry;

/**
 * This edge interface specifies an edge. An edge contains two vertices, an ID,
 * a name and a label.
 */
public interface Edge<V extends Vertex> {

	/**
	 * Returns the vertices connected with this edge.
	 * 
	 * @return The vertices connected with the edge.
	 */
	public List<V> getVertices();

	/**
	 * Returns the name of the edge.
	 * 
	 * @return The name of the edge.
	 */
	public String getName();

	/**
	 * Returns the ID of the edge.
	 * 
	 * @return The id of the edge.
	 */
	public Integer getID();

	/**
	 * Returns the label of the edge.
	 * 
	 * @return The label of the edge.
	 */
	public String getLabel();

	/**
	 * Adds the edge to a {@link FastGraphAccessor}.
	 * 
	 * @param fga The {@link FastGraphAccessor} to whom this edge will be added.
	 */
	public void addToFastGraphAccessor(FastGraphAccessor fga);

	/**
	 * Returns a {@link SerializedEdge} representation of the edge.
	 * 
	 * @param attributes The attributes that have to be serialized.
	 * @return The {@link SerializedEdge} representation of the edge.
	 */
	public SerializedEdge<V> serialize(List<Entry<String, String>> attributes);
	
	
	/**
	 * Returns the {@link EdgePath} of the edge.
	 * The edge path is attached to the edge and cannot be replaced.
	 * 
	 * @return the edge path
	 */
	public EdgePath getPath();
}
