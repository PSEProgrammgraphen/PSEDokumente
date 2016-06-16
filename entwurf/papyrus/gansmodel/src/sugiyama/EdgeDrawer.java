package sugiyama;

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
public class EdgeDrawer<G extends DirectedGraph<V, E>, V extends Vertex, E extends DirectedEdge<V>> implements IEdgeDrawer<G,V,E>{

	@Override
	public void drawEdges(IEdgeDrawerGraph<G, V, E> graph) {
		// TODO Auto-generated method stub
		
	}

}
