package sugiyama;

import plugin.LayoutAlgorithm;
import graphmodel.DirectedGraph;

import java.util.Set;

import graphmodel.DirectedEdge;
import parameter.Settings;

public abstract class SugiyamaLayoutAlgorithm implements LayoutAlgorithm<DirectedGraph> {
	
	private Set<DirectedEdge> removedEdges;

	public Set<DirectedEdge> getRemovedEdges(){return removedEdges;}

	public void getParameterDialog(){}

	public abstract Settings getSettings();

	public void layout(DirectedGraph graph)
	{
		
	}
}
