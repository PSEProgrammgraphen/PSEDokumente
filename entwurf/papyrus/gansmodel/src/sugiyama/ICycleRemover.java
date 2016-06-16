package sugiyama;

import java.util.Set;

import graphmodel.DirectedGraph;
import sugiyama.SugiyamaGraph.SugiyamaEdge;

/**
 * This interfaces represents a class that generates a DAG(Directed Acyclic Graph) from a {@link DirectedGraph}.
 */
public interface ICycleRemover {


	/**
	 * Searches for a acyclic subgraph in the graph argument and reversed the direction of the edges that
	 * are not part of this subgraph.
	 * 
	 * @param  graph the input graph to remove cycles from
	 * @return       a set of edges whose direction has been reversed in order to remove cycles from the graph
	 */
	public Set<SugiyamaEdge> removeCycles(ICycleRemoverGraph graph);
}
