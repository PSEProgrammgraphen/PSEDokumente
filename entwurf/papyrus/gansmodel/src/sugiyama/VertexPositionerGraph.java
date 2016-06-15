package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public interface VertexPositionerGraph<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	/**
	 * Get the amount of dummy vertices that are not in the same column as the most dummy vertices that are in the same column.
	 * 
	 * 
	 * @param source
	 * 		the source vertex
	 * @param target
	 * 		the target vertex
	 * @return
	 * 		the amount of deviating dummy vertices
	 */
	public int getDeviatingDummiesCount(V source, V target);
	
	/**
	 * Realigns all vertices from a source vertex to the next not dummy vertex in order to set the dummy vertices and the source vertex as good as possible in one column.
	 * 
	 * @param source
	 * 		the source vertex
	 */
	public void alignVertex(V source);
}
