package graphmodel;

import java.util.List;
import java.util.Set;

import objectproperty.GAnsProperty;
import plugin.LayoutOption;

/**
 * A {@link DefaultDirectedGraph} is a specific Graph which contains just {@link DirectedEdge} as edges
 * 
 *
 */
public class DefaultDirectedGraph<V extends Vertex, E extends DirectedEdge<V>> 
		implements DirectedGraph<V, E> {

	private DirectedGraphLayoutRegister register;
	private GAnsProperty<String> name;
	private GAnsProperty<Integer> id;
	
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
	 * @return 
	 */
	public V getSource(E edge) { 
		// TODO Auto-generated method
		return null;
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

	@Override
	public SerializedGraph serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return name.getPropertyValue();
	}

	@Override
	public Integer getID() {
		return id.getPropertyValue();
	}

}
