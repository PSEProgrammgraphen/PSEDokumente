package gui;

import java.util.LinkedList;
import java.util.Map;

import graphmodel.Edge;
import graphmodel.Graph;
import graphmodel.Vertex;
import javafx.util.Pair;

/**
 * The GraphViewGraphFactory generates the visual representation of a given
 * {@link Graph} and gives access to the set {@link Graph}.
 * 
 * @author Nicolas
 */
public class GraphViewGraphFactory {

	private Graph<?, ?> graph;
	private Map<VertexShape, Vertex> vertices;
	private Map<EdgeShape, Edge<?>> edges;

	/**
	 * Constructor. Sets the graph and generates the vertices and edges for
	 * visualization.
	 * 
	 * @param graph
	 *            The graph data that will be shown.
	 */
	public GraphViewGraphFactory(Graph<?, ?> graph) {
		this.graph = graph;
		// TODO: parsen des graphs und erstellen von vertex und danach edges.
	}

	/**
	 * Returns all graphical elements that have been generated by the factory.
	 * 
	 * @return All graphical elements generated by the factory.
	 */
	public LinkedList<GAnsGraphElement> getGraphicalElements() {
		return null;
	}

	/**
	 * Returns the vertex element from the graph model that is being represented
	 * by the shape. Can be null if an {@link EdgeShape} is passed.
	 * 
	 * @param shape
	 *            The shape that represents the vertex.
	 * @return The Vertex being represented by the passed shape.
	 */
	public Vertex getVertexFromShape(GAnsGraphElement shape) {
		return vertices.get(shape);
	}

	/**
	 * Returns the edge element from the graph model that is being represented
	 * by the shape. Can be null if an {@link VertexShape} is passed.
	 * 
	 * @param shape
	 *            The shape that represents the edge.
	 * @return The Edge being represented by the passed shape.
	 */
	public Edge<?> getEdgeFromShape(GAnsGraphElement shape) {
		return edges.get(shape);
	}
	
	/**
	 * Calculates and returns the size of a vertex with the given text.
	 * 
	 * @param text The text which size the vertex depends on.
	 * @return A Pair of width and height of the vertex.
	 */
	public static Pair<Double, Double> getSizeOfVertex(String text) {
		VertexShape shape = new VertexShape(text);
		Pair<Double, Double> pair = new Pair<Double, Double>(shape.getWidth(), shape.getHeight());
		return pair;
	}
}
