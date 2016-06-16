package graphmodel;

import java.util.HashMap;
import java.util.Map;

/**
 * This vertex interface specifies an vertex.
 * An vertex contains an ID and a name
 *
 */
public class SerializedVertex {
	private String name;
	private int id;

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
}
