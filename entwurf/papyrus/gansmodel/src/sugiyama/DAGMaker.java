package sugiyama;

import java.util.Set;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

/**
 * Takes a directed Graph G = (V, E) and removes a set of edges E_ so that the resulting Graph G' = (V, E\E_) is a DAG.
 * 
 * @author Lucas
 *
 */
public class DAGMaker<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {


	public DAGMaker() {
	}

	public Set<Vertex> removeCycles(DirectedGraph<G, V, E> graph) {
		return null;
	}
}
