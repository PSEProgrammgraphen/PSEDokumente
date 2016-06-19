package graphmodel;

import java.util.HashMap;
import java.util.Map;

/**
 * This vertex interface specifies an vertex.
 * An vertex contains an ID and a name
 *
 */
public class SerializedVertex implements Vertex {
	private String name;
	private int id;
	private String label;

	public Map<String, String> getAttributes() {
		return new HashMap<String, String>();
	}
	
	public void setAttribute(String name, String value) {
		
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Integer getID() {
		return this.id;
	}
	
	@Override
	public String getLabel() {
		return this.label;
	}

	@Override
	public void addToFastGraphAccessor(FastGraphAccessor fga) {

	}

	@Override
	public SerializedVertex serialize() {
		return this;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
}
