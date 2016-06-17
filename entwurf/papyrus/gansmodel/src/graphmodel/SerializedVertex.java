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

	/**
	 * Get the name of the vertex
	 * 
	 * @return 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Get the ID of the vertex
	 * 
	 * @return 
	 */
	public Integer getID() {
		return this.id;
	}
	
	public String getLabel() {
		return this.label;
	}

	/**
	 * Adds Values to FastGraphAccessor
	 * 
	 * @return 
	 */
	public void addToFastGraphAccessor(FastGraphAccessor fga) {

	}

	public Map<String, String> getAttributes() {
		return new HashMap<String, String>();
	}


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
