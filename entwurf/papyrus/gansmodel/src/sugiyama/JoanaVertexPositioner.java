package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.Vertex;

/**
 * This class takes a directed graph and position its vertices in order to look more clearly. (e.g. position vertices in a row or column)
 *
 * @param <G> the type of the directed graph
 * @param <V> the type of the vertices the graph contains
 * @param <E> the type of the directed edges the graph contains
 */
public class JoanaVertexPositioner <G extends JoanaVertexPositionerGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> implements VertexPositioner<G,V,E>{

	@Override
	public void positionVertices(G graph) {
		// TODO Auto-generated method stub
		
	}

}
