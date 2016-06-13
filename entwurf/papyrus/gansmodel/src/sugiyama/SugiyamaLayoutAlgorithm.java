package sugiyama;

import plugin.LayoutAlgorithm;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;

import java.util.Set;

import graphmodel.DirectedEdge;
import parameter.Settings;

public class SugiyamaLayoutAlgorithm<G extends DirectedGraph<G, V, E>, V extends Vertex, E extends DirectedEdge<V>> 
	implements LayoutAlgorithm<G, V, E> {
	
	private Set<DirectedEdge<Vertex>> removedEdges;

	public Set<DirectedEdge<Vertex>> getRemovedEdges(){return removedEdges;}

	public void getParameterDialog(){}

	public Settings getSettings() {return null;}

	@Override
	public void layout(G graph) {
	}
}
