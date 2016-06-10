package plugin;

import graphmodel.Edge;

public class EdgeFilter {

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
	public boolean matches(Edge toMatch) { 
		// TODO Auto-generated method
		return false;
	 } 

}
