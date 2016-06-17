package graphmodel;

import java.util.Set;

/**
 * This graph interface specifies a graph.
 * A graph contains edges and vertices.
 */
public interface Graph<V extends Vertex, E extends Edge<V>> {


	/**
	 * Returns the name of the Graph.
	 * 
	 * @return
	 * 		name of the graph
	 */
	public String getName();


	/**
	 * Returns the ID of the graph.
	 * 
	 * @return
	 * 		id of the graph
	 */
	public Integer getID(); 
	
	/**
	 * Get a set of all vertices in this graph
	 * 
	 * @return 
	 */
	public Set<V> getVertexSet();

	/**
	 * Get a set of all edges in this graph
	 * 
	 * @return 
	 */
	public Set<E> getEdgeSet();

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

	public SerializedGraph serialize();
}
