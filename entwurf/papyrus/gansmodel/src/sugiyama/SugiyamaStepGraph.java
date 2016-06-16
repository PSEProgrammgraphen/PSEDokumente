package sugiyama;

import java.util.Set;

import sugiyama.SugiyamaGraph.SugiyamaEdge;
import sugiyama.SugiyamaGraph.SugiyamaVertex;

public interface SugiyamaStepGraph 
{	
	/**
	 * Returns the set of edges  in this graph as {@link SugiyamaEdge}.
	 * @return the set of Sugiyama edges in this graph
	 */
	public Set<SugiyamaEdge> getEdgeSet();
	
	/**
	 * Returns the set of vertices in this graph as {@link SugiyamaVertex}
	 * @return the set of Sugiyama vertices in this graph
	 */
	public Set<SugiyamaVertex> getVertexSet();
	
	/**
	 * Returns the Sugiyama edges which are incident to the specified vertex 
	 * @param vertex the vertex to get it's incident edges
	 * @return 		 the set of the edges
	 */
	public Set<SugiyamaEdge> edgesOf(SugiyamaVertex vertex);
	
	/**
	 * Returns the source vertex of the specified edge
	 * @param edge the edge to get it's source vertex
	 * @return	   the source vertex of the edge
	 */
	public SugiyamaVertex getSource(SugiyamaEdge edge);
	
	/**
	 * Returns the target vertex of the specified edge
	 * @param edge the edge to get it's target vertex
	 * @return	   the target vertex of the edge
	 */
	public SugiyamaEdge getTarget(SugiyamaEdge edge);
}