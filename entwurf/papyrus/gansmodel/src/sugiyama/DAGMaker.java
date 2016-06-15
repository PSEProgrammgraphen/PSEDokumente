package sugiyama;

import java.util.Set;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * This class takes a directed Graph G = (V, E) and removes a set of edges E_ 
 * so that the resulting Graph G' = (V, E\E_) is a DAG(Directed Acyclic Graph).
 * 
 * @param <G> the type of the directed graph which should be transformed into a DAG
 * @param <V> the type of the vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */
public class DAGMaker<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {


	/**
	 * Searches for a acyclic subgraph in the graph argument and reversed the direction of the edges that
	 * are not part of this subgraph.
	 * 
	 * @param  graph the input graph to remove cycles from
	 * @return       a set of edges whose direction has been reversed in order to remove cycles from the graph
	 */
	public Set<E> removeCycles(SugiyamaGraph<G, V, E> graph) {
		return null;
	}
}
