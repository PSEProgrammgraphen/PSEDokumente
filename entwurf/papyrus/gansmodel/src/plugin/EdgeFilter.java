package plugin;

import graphmodel.Edge;

/**
 * This Class represents a filter for edge types. 
 * The type of the edge can be specified through different parameters.
 *
 */
public class EdgeFilter {

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
	 * This method checks if an edge matches this Filter.
	 * It will compare specified parameters of the edge with the defined parameters of this filter.
	 * 
	 * @param toMatch the edge which should be checked
	 * @return true if the edge matches this Filter, otherwise false
	 */
	public boolean matches(Edge toMatch) { 
		// TODO Auto-generated method
		return false;
	 } 

}
