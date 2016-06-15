package sugiyama;

import plugin.LayoutAlgorithm;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

import java.util.Set;

import graphmodel.DirectedEdge;
import parameter.Settings;

/**
 * This class controls the collaboration between every single step of Sugiyama Layout.
 *
 * @param <G> a directed graph
 * @param <V> a vertex
 * @param <E> a directed edge
 */
public class SugiyamaLayoutAlgorithm<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> 
	implements LayoutAlgorithm<G, V, E> {
	
	private Set<E> brokenCycleEdges;

	public Settings getSettings() {return null;}

	@Override
	public void layout(G graph) {
	}
}
