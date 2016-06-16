package graphmodel;

import java.util.Set;
import java.util.HashMap;
import java.util.Map;

/**
 * A {@link SerializedGraph} is a specific Graph that contains all informations as Strings
 * 
 *
 */
public class SerializedGraph<V extends SerializedVertex, E extends SerializedEdge<V>>
		implements Graph<V, E> {

	/**
	 * Adds a new Edge to the graph
	 */
	public void addEdge() {

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
	public void addToFastGraphAccessor(FastGraphAccessor fga) {
		// TODO Auto-generated method stub
		
	}

	public Map<String, String> getAttributes() {
		return new HashMap<String, String>();
	}

	public SerializedGraph<V, E> serialize() {
		return this;
	}
}
