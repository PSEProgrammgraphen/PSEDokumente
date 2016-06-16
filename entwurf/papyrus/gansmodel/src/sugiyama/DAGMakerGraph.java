package sugiyama;

import java.util.Set;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;
import sugiyama.SugiyamaGraph.SugiyamaEdge;
import sugiyama.SugiyamaGraph.SugiyamaVertex;

public interface DAGMakerGraph<G extends DirectedGraph<V, E>, V extends Vertex, E extends DirectedEdge<V>>
{
	/**
	 * Reverses the direction of a sugiyama edge.
	 * The underlying edge won't be reversed to avoid
	 * inconsistencies in the underlying graph
	 * Instead the reversing will be saved in the SugiyamaEdge.
	 * If the edge is already reversed it will be reversed again.
	 * 
	 * @param edge the edge to reverse its direction
	 */
	public void reverseEdge(SugiyamaEdge<V, E> edge);
	
	/**
	 * Returns true if the specified edge is reversed, false otherwise
	 * @param edge the edge
	 * @return true if the edge is reversed, false otherwise
	 */
	public boolean isReversed(SugiyamaEdge<V, E> edge);
	
	/**
	 * Returns the set of edges  in this graph as {@link SugiyamaEdge}.
	 * @return a set of sugiyama edges
	 */
	public Set<SugiyamaEdge<V, E>> getEdgeSet();
	
	public Set<SugiyamaVertex<V>> getVertexSet();
	
	public Set<SugiyamaEdge<V, E>> edgesOf(SugiyamaVertex<V> vertex);
}
