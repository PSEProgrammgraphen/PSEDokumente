package graphmodel;

import java.util.List;

import objectproperty.GAnsProperty;

/**
 * A {@link DirectedEdge} is an edge that has one source and one target vertex.
 * So the direction of the edge is specified.
 *
 */
public class DirectedEdge<V extends Vertex> implements Edge<V> {

	private List<V> vertices;
	private GAnsProperty<String> name;
	private GAnsProperty<Integer> id;
	private GAnsProperty<String> label;
	
	/**
	 * Returns the source vertex of this directed edge.
	 * 
	 * @return
	 * 		the source vertex of this directed edge
	 */
	public V getSource() {
		return null;
	}
	
	/**
	 * Returns the target vertex of this edge.
	 * 
	 * @return
	 * 		the target vertex of this directed edge
	 */
	public V getTarget() {
		return null;
	}
	
	@Override
	public List<V> getVertices() {
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
	
	@Override
	public String getLabel() {
		return label.getPropertyValue();
	}

	@Override
	public void addToFastGraphAccessor(FastGraphAccessor fga) {
		
	}

	@Override
	public SerializedEdge<V> serialize() {
		return null;
	} 

}
