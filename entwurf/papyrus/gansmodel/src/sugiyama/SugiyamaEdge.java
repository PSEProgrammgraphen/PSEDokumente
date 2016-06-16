package sugiyama;

import java.util.List;

import graphmodel.DirectedEdge;
import graphmodel.Vertex;
import sugiyama.SugiyamaGraph.SupplementPath;

/**
 * A wrapper class for directed edges to implement additional functionality
 * to apply the sugiyama layout to the SugiyamaGraph containing them.
 *
 * @param <E> the type of the edge which should be wrapped
 * @param <V> the type of the vertex the E connects
 */
public class SugiyamaEdge<E extends DirectedEdge<V>, V extends Vertex> extends DirectedEdge<SugiyamaVertex<V>>
{
	// TODO: Move into SugiyamaGraph
	private SugiyamaEdge(E edge) {}	
	public E getEdge() { return null; }
	private boolean isReversed() { return false; }
	private void setReversed(boolean rev) {}
	private boolean isReplaced() { return false; }
	private List<SupplementPath> getSupplement() { return null; }
}