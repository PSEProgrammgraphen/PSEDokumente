package sugiyama;

import java.util.Set;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * This class takes a directed graph, as a {@link SugiyamaClass}.
 * It removes dummy vertices and reverses previously reversed edges.
 * Afterwards it assigns every edge points it must run through.
 * 
 * @param <G> the type of the directed graph
 * @param <V> the type of the vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */
public class EdgeDrawing<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	/**
	 * Draws the edges from the graph argument and reverses the edges, which have been reversed earlier,
	 * so they have now the correct direction.
	 * 
	 * @param graph the input graph
	 */
	public void drawEdges(SugiyamaGraph<G, V, E> graph) {
	}

}
