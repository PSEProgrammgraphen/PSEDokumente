package graphmodel;

import java.util.List;
import java.util.Set;

import plugin.LayoutOption;

/**
 * This graph interface specifies a graph. A graph contains edges and vertices.
 */
public interface Graph<V extends Vertex, E extends Edge<V>> {

	/**
	 * Returns the name of the Graph.
	 * 
	 * @return The name of the graph.
	 */
	public String getName();

	/**
	 * Returns the ID of the graph.
	 * 
	 * @return The id of the graph.
	 */
	public Integer getID();

	/**
	 * Returns all vertices of the graph.
	 * 
	 * @return A set of all vertices of the graph.
	 */
	public Set<V> getVertexSet();

	/**
	 * Returns all edges of the graph.
	 * 
	 * @return A set of all edges of the graph.
	 */
	public Set<E> getEdgeSet();

	/**
	 * Returns a list of all edges of a vertex.
	 * 
	 * @param vertex
	 *            The vertex which edges will be returned.
	 * @return All edges which are connected with the supplied vertex.
	 */
	public Set<E> edgesOf(V vertex);

	/**
	 * Adds the graph to a {@link FastGraphAccessor}.
	 * 
	 * @param fga
	 *            The {@link FastGraphAccessor} to whom this graph will be
	 *            added.
	 */
	public void addToFastGraphAccessor(FastGraphAccessor fga);

	/**
	 * Returns a list of layouts which have been registered at the corresponding
	 * LayoutRegister for this graph type. The graph implementing this interface
	 * will be set as target of the LayoutOption.
	 */
	/**
	 * Returns a list of layouts which have been registered at the corresponding
	 * LayoutRegister for this graph type. The graph implementing this interface
	 * will be set as target of the LayoutOption.
	 * 
	 * @return A list of layouts which have been registered at the corresponding
	 *         LayoutRegister for this graph type.
	 */
	public List<LayoutOption> getRegisteredLayouts();

	/**
	 * Returns a {@link SerializedGraph} representation of the graph.
	 * 
	 * @return The {@link SerializedGraph} representation of the graph.
	 */
	public SerializedGraph serialize();
}
