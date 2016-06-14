package graphmodel;

import java.util.List;
import java.util.Set;

/**
 * This graph interface specifies a graph.
 * A graph contains edges and vertices.
 */
public interface Graph<V extends Vertex, E extends Edge<V>> {

	/**
	 * Adds a new Edge to the graph
	 */
	public void addEdge();

	/**
	 * Set a set of vertices
	 * 
	 * @param edge 
	 */
	public void setVertexSet(Set<E> edge);

	/**
	 * Get a set of all vertices in this graph
	 * 
	 * @return 
	 */
	public Set<V> getVertexSet();


	/**
	 * Set a set of edges
	 * 
	 * @param edge 
	 */
	public void setEdgeSet(Set<E> edge);

	/**
	 * Get a set of all edges in this graph
	 * 
	 * @return 
	 */
	public Set<E> getEdgeSet();

	/**
	 * Adds a new Vertex to the graph
	 * 
	 * @param vertex 
	 */
	public void addVertex(V vertex);

	/**
	 * Adds a new Edge to the graph
	 * 
	 * @param edge 
	 */
	public void addEdge(E edge);

	/**
	 * get a list of all edges of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Set<E> edgesOf(V vertex);

	/**
	 * adds this graph to a fastGraphAccessor
	 * 
	 * @param vertex 
	 * @return 
	 */
	public void addToFastGraphAccessor(FastGraphAccessor fga);
}
