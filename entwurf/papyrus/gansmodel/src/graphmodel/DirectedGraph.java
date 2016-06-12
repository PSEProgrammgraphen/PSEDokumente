package graphmodel;

import java.util.Set;
import java.util.List;
import graphmodel.Graph.E;
import graphmodel.Graph.V;
import joana.JoanaPlugin;
import plugin.LayoutAlgorithm;
import plugin.LayoutOption;

/**
 * A {@link DirectedGraph} is a specific Graph which contains just {@link DirectedEdge} as edges
 * 
 *
 */
public class DirectedGraph implements Graph, Layoutable<DirectedGraph> {

	/**
	 * Get the outdegree of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Integer outdegreeOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Get the indegree of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Integer indegreeOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Get a set of all incoming edges of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Set incomingEdgesOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Get a set of all outcoming edges of a vertex
	 * 
	 * @param vertex 
	 * @return 
	 */
	public Set outcomingEdgesOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @return 
	 */
	public List<E> getEdges() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 */
	public void addEdge() { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @return 
	 */
	public Set getVertexSet() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @param edge 
	 */
	public void setEdgeSet(Set edge) { 
		// TODO Auto-generated method
	 }


	/**
	 * 
	 * @param edge 
	 * @return 
	 */
	public V getSource(E edge) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @return 
	 */
	public Set getEdgeSet() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @param vertex 
	 */
	public void addVertex(V vertex) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param edge 
	 */
	public void addEdge(E edge) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param edge 
	 * @return 
	 */
	public V getTarget(E edge) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @param vertex 
	 * @return 
	 */
	public List<E> edgesOf(V vertex) { 
		// TODO Auto-generated method
		return null;
	 }


	@Override
	public List<LayoutOption<DirectedGraph>> getRegisteredLayouts() {
		return null;
	}

	@Override
	public void applyLayout(LayoutAlgorithm<DirectedGraph> alg) {
		alg.layout(this);
	}
}
