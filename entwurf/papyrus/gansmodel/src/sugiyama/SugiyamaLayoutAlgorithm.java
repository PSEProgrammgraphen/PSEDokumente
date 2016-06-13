package sugiyama;

import plugin.LayoutAlgorithm;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;
import graphmodel.DirectedEdge;
import parameter.Settings;

import java.util.Set;

/**
 * This class controls the collaboration between every single step of Sugiyama Layout.
 *
 * @param <G> a directed graph
 * @param <V> a vertex
 * @param <E> a directed edge
 */
public class SugiyamaLayoutAlgorithm<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> 
	implements LayoutAlgorithm<G, V, E> {
	
	private Set<E> invertedEdges;
	
	/**
	 * 
	 * @return 
	 * 		a set of edges that have been inverted by {@link DAGMaker} in order to remove cycles in the originally graph
	 */
	public Set<E> getInvertedEdges(){return invertedEdges;}

	public void getParameterDialog(){}

	public Settings getSettings() {return null;}

	@Override
	public void layout(G graph) {
	}
}
