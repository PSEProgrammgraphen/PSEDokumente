package graphmodel;

import java.util.Set;
import java.util.List;
import plugin.LayoutAlgorithm;
import plugin.LayoutOption;

/**
 * A {@link DirectedGraph} is a specific Graph which contains just {@link DirectedEdge} as edges
 * 
 *
 */
public class DirectedGraph<V extends Vertex, E extends DirectedEdge<V>> 
		implements Graph<V, E>, Layoutable {

	private DirectedGraphLayoutRegister register;
	
	/**
	 * Get the outdegree of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Integer outdegreeOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Get the indegree of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Integer indegreeOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Get a set of all incoming edges of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Set<E> incomingEdgesOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Get a set of all outcoming edges of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Set<E> outcomingEdgesOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 */
	public void addEdge() { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @return 
	 */
	public Set<V> getVertexSet() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @return 
	 */
	public Set<E> getEdgeSet() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @param edge 
	 */
	public void setEdgeSet(Set<E> edge) { 
		// TODO Auto-generated method
	 }


	/**
	 * 
	 * @param edge 
	 * @return 
	 */
	public V getSource(E edge) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @param vertex 
	 */
	public void addVertex(V vertex) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param edge 
	 */
	public void addEdge(E edge) { 
		// TODO Auto-generated method
	 }

	@Override
	public void setVertexSet(Set<E> edge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<E> edgesOf(V vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LayoutOption> getRegisteredLayouts() {
		return null;
	}

	@Override
	public void addToFastGraphAccessor(FastGraphAccessor fga) {
		// TODO Auto-generated method stub
		
	}

}
