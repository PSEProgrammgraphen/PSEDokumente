package sugiyama;

import graphmodel.DefaultVertex;
import graphmodel.Vertex;

public class SugiyamaVertex<V extends Vertex> extends DefaultVertex
{
	// TODO: Move into SugiyamaGraph
	public boolean isDummyVertex() {return false;}
	public V getVertex() {return null;}
	
}
