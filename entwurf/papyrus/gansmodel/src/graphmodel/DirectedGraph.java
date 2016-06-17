package graphmodel;

import java.util.Set;

/**
 * A {@link DirectedGraph} is a specific Graph which contains just {@link DirectedEdge} as edges
 * 
 *
 */
public interface DirectedGraph<V extends Vertex, E extends DirectedEdge<V>> 
		extends Graph<V, E> {
	
	/**
	 * Get the outdegree of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Integer outdegreeOf(V vertex);

	/**
	 * Get the indegree of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Integer indegreeOf(V vertex);

	/**
	 * Get a set of all incoming edges of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Set<E> incomingEdgesOf(V vertex);

	/**
	 * Get a set of all outcoming edges of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Set<E> outcomingEdgesOf(V vertex);
}
