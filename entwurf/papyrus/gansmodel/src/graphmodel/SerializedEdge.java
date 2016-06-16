package graphmodel;

import java.util.List;
import java.util.Map;

/**
 * A {@link DirectedEdge} is an edge that has one source and one target vertex.
 * So the direction of the edge is specified.
 *
 */
public class SerializedEdge<V extends Vertex> implements Edge<V> {
	@Override
	public String getName() {
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
		return null;
	}

	public SerializedEdge serialize() {
		return this;
	}

	@Override
	public List<V> getVertices() {
		// TODO Auto-generated method stub
		return null;
	}
}
