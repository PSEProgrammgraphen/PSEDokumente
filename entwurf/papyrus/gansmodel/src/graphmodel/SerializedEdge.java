package graphmodel;

import java.util.List;
import java.util.Map;

/**
 * A {@link DirectedEdge} is an edge that has one source and one target vertex.
 * So the direction of the edge is specified.
 *
 */
public class SerializedEdge<V extends Vertex> implements Edge<V> {
	private String name;
	private int id;
	private String label;
	
	public Map<String, String> getAttributes() {
		return null;
	}
	
	public void setAttribute(String name, String value) {
		
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Integer getID() {
		return id;
	}
	
	@Override
	public String getLabel() {
		return label;
	}
	
	@Override
	public List<V> getVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addToFastGraphAccessor(FastGraphAccessor fga) {
		// TODO Auto-generated method stub
		
	} 

	@Override
	public SerializedEdge<V> serialize() {
		// TODO Auto-generated method stub
		return null;
	}
}
