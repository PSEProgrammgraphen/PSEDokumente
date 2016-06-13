package sugiyama;

import java.util.Set;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * This class takes a directed Graph G = (V, E) and removes a set of edges E_ so that the resulting Graph G' = (V, E\E_) is a DAG(Directed Acyclic Graph).
 * 
 * @param <G> a directed graph
 * @param <V> a vertex
 * @param <E> a directed edge
 */
public class DAGMaker<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {


	/**
	 * Searches for the maximum acyclic subgraph in the graph argument and invertes the direction of the edges that
	 * are not part of this subgraph.
	 * 
	 * @param graph the input graph to remove cycles from
	 * @return a set of edges whose direction has been inverted in order to remove cycles from the graph
	 */
	public Set<E> removeCycles(G graph) {
		return null;
	}
}
