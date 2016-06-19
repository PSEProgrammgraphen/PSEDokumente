package graphRegex;

import java.util.List;

import graphmodel.Graph;

public class Selector {

	/**
	 * 
	 */
	public String value;
	/**
	 * 
	 */
	public List<Graph> selectedSubgraphs;
	/**
	 * 
	 * @return 
	 */
	public String getValue() {
	 	 return value; 
	}
	/**
	 * Setter of value
	 */
	public void setValue(String value) { 
		 this.value = value; 
	}
	/**
	 * Getter of selectedSubgraphs
	 */
	public List<Graph> getSelectedSubgraphs() {
	 	 return selectedSubgraphs; 
	}
	/**
	 * Setter of selectedSubgraphs
	 */
	public void setSelectedSubgraphs(List<Graph> selectedSubgraphs) { 
		 this.selectedSubgraphs = selectedSubgraphs; 
	}
	/**
	 * 
	 * @param graph 
	 */
	public void getSubgraphs(Graph graph) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param graphs 
	 */
	public void setSubgraphs(Graph graphs) { 
		// TODO Auto-generated method
	 } 

}
