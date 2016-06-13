package sugiyama;

import java.util.Set;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * This class takes a directed graph and draws its edges. 
 *
 * @param <G> a directed graph
 * @param <V> a vertex
 * @param <E> a directed edge
 */
public class EdgeDrawing<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	/**
	 * Draws the edges from the graph argument and invertes the edges from invertedEdges argument again so they have now the right direction.
	 * 
	 * @param 
	 * 		graph the input graph
	 * @param 
	 * 		invertedEdges the edges which have been inverted by {@link DAGMaker}
	 */
	public void drawEdges(G graph, Set<E> invertedEdges) {
	}

}
