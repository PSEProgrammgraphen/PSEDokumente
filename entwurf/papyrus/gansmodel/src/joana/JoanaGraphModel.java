package joana;

import graphmodel.GraphModel;
import java.util.List;
import graphmodel.Graph;

/**
 * This is the Joana specified Graphmodel.
 * It can only contain {@link methodgraph} and {@link callgraph}
 *
 */
public class JoanaGraphModel extends GraphModel {

	/**
	 * 
	 */
	private List<MethodGraph> methodgraphs;
	/**
	 * 
	 */
	private Callgraph callgraph;
	
	/**
	 * Getter of methodgraphs
	 */
	public List<MethodGraph> getMethodgraphs() {
	 	 return methodgraphs; 
	}
	/**
	 * Setter of methodgraphs
	 */
	public void setMethodgraphs(List<MethodGraph> methodgraphs) { 
		 this.methodgraphs = methodgraphs; 
	}
	/**
	 * Getter of callgraph
	 */
	public Callgraph getCallgraph() {
	 	 return callgraph; 
	}
	/**
	 * Setter of callgraph
	 */
	public void setCallgraph(Callgraph callgraph) { 
		 this.callgraph = callgraph; 
	}
	public void setMethodGraph(List<MethodGraph> methodgraphs) { 
		// TODO Auto-generated method
	 }
	/**
	 * Getter of graph 
	 * 
	 * @return 
	 */
	public List<MethodGraph> getMethodGraphs() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * Getter of graph
	 * 		 
	 * @return 
	 */
	public List<Graph> getGraphs() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @return 
	 */
	public Callgraph getCallGraph() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param graph 
	 */
	public void setCallGraph(Callgraph graph) { 
		// TODO Auto-generated method
	 } 

}
