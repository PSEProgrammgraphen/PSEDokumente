package graphmodel;

/**
 *
 */
public interface CompoundVertex<G extends Graph<V, E>, V extends Vertex, E extends Edge<V>> 
	extends Vertex 
{
	public G getGraph();
}
