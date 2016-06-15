package graphmodel;


/**
 * A {@link DirectedEdge} is an edge that has one source and one target vertex.
 * So the direction of the edge is specified.
 *
 */
public class SerializedEdge<V extends Vertex> implements Edge<V> {

	@Override
	public V getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getID() {
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

	public SerializedEdge serialize() {
		return this;
	}
}
