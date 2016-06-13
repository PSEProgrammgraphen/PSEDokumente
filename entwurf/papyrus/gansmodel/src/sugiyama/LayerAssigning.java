package sugiyama;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public class LayerAssigning<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> {

	public LayerAssigning() { }

	public void assignLayers(G graph) { }

	public void setMaxHeight(int height) { }

	public void setMaxWidth(int height) { }
}
