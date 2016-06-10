package graphmodel;

import java.util.Map;
import java.util.List;

/**
 * 
 * Created by Sven on 09.06.2016.
 
 * @author
 */
public class FastGraphAccessor {

	/**
	 * 
	 */
	private Map edgeValues;
	/**
	 * 
	 */
	private Map vertexValues;
	/**
	 * 
	 */
	private Graph graph;
	/**
	 * Getter of edgeValues
	 */
	public Map getEdgeValues() {
	 	 return edgeValues; 
	}
	/**
	 * Setter of edgeValues
	 */
	public void setEdgeValues(Map edgeValues) { 
		 this.edgeValues = edgeValues; 
	}
	/**
	 * Getter of vertexValues
	 */
	public Map getVertexValues() {
	 	 return vertexValues; 
	}
	/**
	 * Setter of vertexValues
	 */
	public void setVertexValues(Map vertexValues) { 
		 this.vertexValues = vertexValues; 
	}
	/**
	 * Getter of graph
	 */
	public Graph getGraph() {
	 	 return graph; 
	}
	/**
	 * Setter of graph
	 */
	public void setGraph(Graph graph) { 
		 this.graph = graph; 
	}
	/**
	 * 
	 * @param value 
	 * @param name 
	 * @return 
	 */
	public List<Edge> getEdgesByAttribute(String value, String name) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param name 
	 * @param edge 
	 * @param value 
	 */
	public void addEdgeForAttribute(String name, Edge edge, String value) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param name 
	 * @param value 
	 * @return 
	 */
	public List<Vertex> getVerticesByAttribute(String name, String value) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param name 
	 */
	public void addVertexAttribute(String name) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vertex 
	 * @param value 
	 * @param name 
	 */
	public void addVertexForAttribute(Vertex vertex, String value, String name) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param name 
	 */
	public void addEdgeAttribute(String name) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void update() { 
		// TODO Auto-generated method
	 } 

}
