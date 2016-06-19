package graphmodel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import objectproperty.GAnsProperty;
import plugin.LayoutOption;

/**
 * A {@link SerializedGraph} is a specific Graph that contains all informations as Strings.
 * 
 *
 */
public class SerializedGraph<V extends SerializedVertex, E extends SerializedEdge<V>>
		implements Graph<V, E> {
	
	private GAnsProperty<String> name;
	private GAnsProperty<Integer> id;

	/**
	 * 
	 */
	public void addEdge() {
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
	 * @return
	 */
	public Map<String, String> getAttributes() {
		return new HashMap<String, String>();
	}
	
	public void setAttribute(String name, String value) {
		
	}

	@Override
	public Set<V> getVertexSet() { 
		// TODO Auto-generated method
		return null;
	 }
	
	@Override
	public Set<E> getEdgeSet() {
		// TODO Auto-generated method stub
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
	
	@Override
	public String getName() {
		return name.getPropertyValue();
	}

	@Override
	public Integer getID() {
		return id.getPropertyValue();
	}

	@Override
	public List<LayoutOption> getRegisteredLayouts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public SerializedGraph<V, E> serialize() {
		return this;
	}
}
