package sugiyama;

import graphmodel.DirectedGraph;
import graphmodel.DefaultVertex;
import graphmodel.DirectedEdge;
import graphmodel.Vertex;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The SugiyamaGraph is a wrapper for a directed graph to enable easy and fast accessibility of
 * attributes and constructs needed during the computation of the hierarchical layout of a directed graph.
 * All vertices are assigned to a layer.
 * The positions of the vertices can be viewed as a grid (with varying widths per layer).
 *
 * @param <G> the directed graph which is used as underlying representation
 * @param <V> the vertex class used in the graph
 * @param <E> the edge class used in the graph
 */
public class SugiyamaGraph<G extends DirectedGraph<V, E>, V extends Vertex, E extends DirectedEdge<V>> 
	extends DirectedGraph<Vertex, DirectedEdge<Vertex>> {
	
	private List<List<V>> layers;
	private Map<V, Integer> vertexToLayer;
	private Set<E> brokenCycleEdges;
	private Set<V> insertedVertices;
	private G graph;
	
	/**
	 * Constructs a new SugiyamaGraph and sets the Graph which is the underlying representation.
	 * To fulfill the invariant that all vertices are assigned to a layer, all vertices
	 * will be assigned to layer 0.
	 * 
	 * @param graph the graph used as underlying representation.
	 */
	public SugiyamaGraph(G graph) {}
	
	/**
	 * Assigns the specified vertex to the specified layer.
	 * A vertex must only be assigned to one layer at the time.
	 * When assigned to a new layer the vertex will be removed from layer it was assigned before.
	 * 
	 * @param vertex the vertex to assign to the layer
	 * @param layerN the index of the layer
	 */
	public void assignToLayer(V vertex, int layerN) {}
	
	/**
	 * Returns a copy of the layer specified by the index.
	 * @param layerN the index of the layer, which should be returned
	 * 
	 * @return the layer
	 */
	public List<V> getLayer(int layerN) { return null; }
	
	/**
	 * Returns a copy of all layers.
	 * 
	 * @return the layers.
	 */
	public List<List<V>> getLayers() { return null; }
	
	/**
	 * Returns the height, i.e. the number of layers.
	 * @return the height
	 */
	public int getHeight() { return 0; }
	
	/**
	 * Returns the width of the layer specified by it's index, i.e. the number of vertices in the layer.
	 * @param layerN the index of the layer
	 * @return the width of the layer
	 */
	public int getWidth(int layerN) { return 0; }

	/**
	 * Returns the width of the widest layer, i.e. the number of vertices the layer with the most vertices contains.
	 * @return the maximum width 
	 */
	public int getMaxWidth() { return 0; }
	
	/**
	 * Reverses the specified edge (u, v) by replacing it with an supplement edge (v, u)
	 * The action will be saved and can later be retrieved with {@code getInvertedEdges()} or
	 * restored with {@code restoreReversedEdges()} of the old state.
	 * While reversed the specified edge won't be part of the edge set and therefore not returned by {@code getEdgeSet()}
	 * 
	 * @param edge the edge to reverse
	 */
	public void reverseEdge(E edge) {}
	
	/**
	 * Returns the set of all with {@code reverseEdge(E edge)} reversed edges.
	 * 
	 * @return the set of all reversed edges.
	 */
	public Set<E> getReversedEdges() { return null; }
	
	/**
	 * Deletes the supplement edges, which have been created when an edge was reversed.
	 * Adds all reversed edges back to the set of edges and returns them.
	 * 
	 * @return the set of edges which have been restored.
	 */
	public Set<E> restoreReversedEdges() { return null; }
	
	/**
	 * Replaces the specified edge with a path of dummy vertices of the specified length.
	 * Replaced edges are removed from the set of edges but saved for later retrieval 
	 * with {@code getReplacedEdges()} or restored with {@code restoreReplacedEdges}.
	 * 
	 * @param edge the edge to be replaced
	 * @param length the length of the path which replaces the edge
	 */
	public void replaceWithSupplementPath(E edge, int length) {}
	
	/**
	 * Returns the set of replaced edges.
	 * 
	 * @return the set of replaced edges
	 */
	public Set<E> getReplacedEdges() { return null; }
	
	/**
	 * Deletes all dummy vertices and edges connecting dummy vertices.
	 * Adds the replaced edges back to set of edges.
	 * 
	 * @return the set of edges, which has been restored
	 */
	public Set<E> restoreReplacedEdges() { return null; }
	
	/**
	 * A supplement edge for reversed and inserted edges for connecting vertices more than one layer apart.
	 */
	public class SupplementEdge extends DirectedEdge<DefaultVertex> {}
	
	/**
	 * A supplement vertex which is inserted between vertices, which are more than one layer apart.
	 */
	public class SupplementVertex extends DefaultVertex {}
}