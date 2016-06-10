package graphmodel;

import java.util.List;
import graphmodel.Graph.E;
import java.util.Set;
import graphmodel.Graph.V;

public interface Graph {

	/**
	 * 
	 * @return 
	 */
	public List<E> getEdges();

	/**
	 * 
	 */
	public void addEdge();

	/**
	 * 
	 * @return 
	 */
	public Set getVertexSet();

	/**
	 * 
	 * @param edge 
	 */
	public void setEdgeSet(Set edge);

	/**
	 * 
	 * @param vertex 
	 */
	public void setVertex(Set vertex);

	/**
	 * 
	 * @param edge 
	 * @return 
	 */
	public V getSource(E edge);

	/**
	 * 
	 * @return 
	 */
	public Set getEdgeSet();

	/**
	 * 
	 * @param vertex 
	 */
	public void addVertex(V vertex);

	/**
	 * 
	 * @param edge 
	 */
	public void addEdge(E edge);

	/**
	 * 
	 * @param edge 
	 * @return 
	 */
	public V getTarget(E edge);

	/**
	 * 
	 * @param vertex 
	 * @return 
	 */
	public List<E> edgesOf(V vertex);

	/**
	 * 
	 * @return 
	 */
	public V getVertex();

	public class E { 
	
	}

	public class V { 
	
	} 

}
