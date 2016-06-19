package sugiyama;

import graphmodel.DirectedGraph;
import sugiyama.SugiyamaGraphBase.SugiyamaEdge;
import sugiyama.SugiyamaGraphBase.SugiyamaVertex;

public interface ICycleRemoverGraph extends DirectedGraph<SugiyamaVertex, SugiyamaEdge> {
	/**
	 * Reverses the direction of a sugiyama edge.
	 * The underlying edge won't be reversed to avoid
	 * inconsistencies in the underlying graph
	 * Instead the reversing will be saved in the SugiyamaEdge.
	 * If the edge is already reversed it will be reversed again.
	 * 
	 * @param edge the edge to reverse its direction
	 */
	public void reverseEdge(SugiyamaEdge edge);
	
	/**
	 * Returns true if the specified edge is reversed, false otherwise
	 * @param edge the edge
	 * @return true if the edge is reversed, false otherwise
	 */
	public boolean isReversed(SugiyamaEdge edge);
}
