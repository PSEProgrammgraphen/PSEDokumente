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
public class JoanaDAGMaker<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> implements DAGMaker<G,V,E>{


	@Override
	public Set<E> removeCycles(G graph) {
		// TODO Auto-generated method stub
		return null;
	}

}
