package graphmodel;

import java.util.List;
import graphmodel.Graph.E;
import java.util.Set;
import graphmodel.Graph.V;

/**
 * This graph interface specifies a graph.
 * A graph contains edges and vertices.
 */
public interface Graph {

	/**
	 * Returns an list of edges.
	 * 
	 * @return 
	 */
	public List<E> getEdges();

	/**
	 * Adds a new Edge to the graph
	 */
	public void addEdge();

	/**
	 * Get a set of all vertices in this graph
	 * 
	 * @return 
	 */
	public Set getVertexSet();

	/**
	 * Set a Set of edges
	 * 
	 * @param edge 
	 */
	public void setEdgeSet(Set edge);


	/**
	 * 
	 * Get the source vertex of an edge
	 * 
	 * @param edge 
	 * @return 
	 */
	public V getSource(E edge);

	/**
	 * Get a set of all Edges in this graph
	 * 
	 * @return 
	 */
	public Set getEdgeSet();

	/**
	 * Adds a new Vertex to the graph
	 * 
	 * @param vertex 
	 */
	public void addVertex(V vertex);

	/**
	 * Adds a new Edge to the graph
	 * 
	 * @param edge 
	 */
	public void addEdge(E edge);

	/**
	 * Get the target vertex of an edge
	 * 
	 * @param edge 
	 * @return 
	 */
	public V getTarget(E edge);

	/**
	 * get a list of all edges of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public List<E> edgesOf(V vertex);


	public class E { 
	
	}

	public class V { 
	
	} 

}
