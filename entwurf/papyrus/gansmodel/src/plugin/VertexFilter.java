package plugin;

import graphmodel.Vertex;

public class VertexFilter {

	/**
	 * 
	 */
	private String name;

	/**
	 * Getter of name
	 */
	public String getName() {
	 	 return name; 
	}

	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}

	/**
	 * 
	 * @param toMatch 
	 * @return 
	 */
	public boolean matches(Vertex toMatch) { 
		// TODO Auto-generated method
		return false;
	 } 

}
