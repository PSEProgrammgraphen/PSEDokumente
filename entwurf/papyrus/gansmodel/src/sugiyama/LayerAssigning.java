package sugiyama;

import java.util.Set;

import graphmodel.DirectedGraph;
import graphmodel.Vertex;

public class LayerAssigning {

	private DirectedGraph graph;
	private Set<Vertex> cycles;

	public LayerAssigning(DirectedGraph graph, Set<Vertex> cycles) {
		this.graph = graph;
		this.cycles = cycles;
		assignLayers(graph);
	}

	private void assignLayers(DirectedGraph graph) {
	}

	private void minimizeHeight(DirectedGraph graph, int height) {
	}

	private void minimizeEdgeLength(DirectedGraph graph, int edgeLength) {
	}

	private void minimizeWidth(DirectedGraph graph, int width) {
	}
}
