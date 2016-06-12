package Sugiyama;

import java.util.Set;

import Graphmodel.DirectedGraph;
import Graphmodel.Vertex;

public class CycleRemoving {

	private DirectedGraph graph;
	private Set<Vertex> cycles;

	public CycleRemoving(DirectedGraph graph) {
		this.graph = graph;
		this.cycles = this.removeCycles(graph);
	}

	private Set<Vertex> removeCycles(DirectedGraph graph) {
		return null;
	}
}
