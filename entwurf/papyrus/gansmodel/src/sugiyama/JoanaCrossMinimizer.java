package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.Vertex;

/**
 * This class takes a Sugiyama Graph and rearranges its vertices on each layer to minimize
 * the amount of edge crossings.
 * 
 * @param <G> the type of directed graph which should be minimized.
 * @param <V> the type of vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */ 
public class JoanaCrossMinimizer<G extends JoanaCrossMinimizerGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> implements CrossMinimizer<G,V,E>{

	@Override
	public void minimizeCrossings(G graph) {
		// TODO Auto-generated method stub
		
	}
	
}
