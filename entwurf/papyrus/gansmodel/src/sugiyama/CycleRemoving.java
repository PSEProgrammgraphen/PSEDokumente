package src.sugiyama;

import java.util.Set;

import src.graphmodel.DirectedGraph;
import src.graphmodel.Vertex;

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
