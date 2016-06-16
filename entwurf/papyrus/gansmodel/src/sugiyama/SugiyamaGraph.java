package sugiyama;

import graphmodel.DirectedGraph;
import graphmodel.SerializedGraph;
import graphmodel.DefaultVertex;
import graphmodel.DirectedEdge;
import graphmodel.Vertex;
import sugiyama.SugiyamaGraph.SupplementPath;

import java.util.List;
import java.util.Map;
import java.util.Set;
import sugiyama.SugiyamaGraph.SugiyamaVertex;
import sugiyama.SugiyamaGraph.SugiyamaEdge;


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
	extends DirectedGraph<SugiyamaVertex<V>, SugiyamaEdge<V, E>>  
	implements DAGMakerGraph<G, V, E>, 
			   LayerAssignerGraph<G, V, E>,
			   CrossMinimizerGraph<G, V, E>,
			   VertexPositionerGraph<G, V, E>,
			   EdgeDrawerGraph<G, V, E>
{
	
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
	 * Returns the set of all with {@code reverseEdge(E edge)} reversed edges.
	 * 
	 * @return the set of all reversed edges.
	 */
	public Set<SugiyamaEdge<V, E>> getReversedEdges() { return null; }
	
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
	
	
	@Override
	public SerializedGraph serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLayerCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVertexCount(int layerNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reverseEdge(SugiyamaEdge<V, E> edge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isReversed(SugiyamaEdge<V, E> edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void swapVertices(SugiyamaVertex<V> first, SugiyamaVertex<V> second) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLayer(SugiyamaVertex<V> vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SugiyamaVertex<V>> getLayer(int layerNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<SugiyamaVertex<V>>> getLayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SugiyamaEdge<V, E>> reverseAllEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEdgeCorner(SugiyamaEdge<V, E> edge, int x, int y, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEdgeCorner(SugiyamaEdge<V, E> edge, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<sugiyama.EdgeDrawerGraph.Point> getEdgeCorners(SugiyamaEdge<V, E> edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLayerY(int layerN, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setX(SugiyamaVertex<V> vertex, int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignToLayer(SugiyamaVertex<V> vertex, int layerNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<SugiyamaEdge<V, E>> edgesOf(SugiyamaVertex<V> vertex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * A supplement path for connecting vertices, which are more than one layer apart.
	 * They are stored in the SugiyamaEdge along with the substituted edge.
	 */
	public static class SupplementPath<V extends Vertex, E extends DirectedEdge<V>> extends DirectedEdge<V>
	{
		/**
		 * Returns the number of vertices including source and target.
		 * @return the length of the path
		 */
		public int getLength() {return 0;}
		
		/**
		 * Returns the list of vertices on the path sorted from source to target excluding the source and target.
		 * @return the list of vertices
		 */
		public List<SupplementVertex> getDummyVertices() {return null;}
		
		/**
		 * Returns the list of edges on the path from source to target
		 * @return the edges
		 */
		public List<SupplementEdge> getEdges() {return null;}
		
		/**
		 * Returns the edge which is substituted by this path
		 * @return the replaced edge
		 */
		public E getReplacedEdge() {return null;}
	}
	/**
	 * A supplement edge which is part of a {@link SupplementPath}.
	 */
	public static class SupplementEdge extends DirectedEdge<DefaultVertex> {}
	
	/**
	 * A supplement vertex which is part of a {@link SupplementPath}.
	 */
	public static class SupplementVertex extends DefaultVertex {}
	
	
	public static class SugiyamaVertex<V extends Vertex> extends DefaultVertex
	{
		public boolean isDummyVertex() {return false;}
		public V getVertex() {return null;}
		
	}
	
	/**
	 * A wrapper class for directed edges to implement additional functionality
	 * to apply the sugiyama layout to the SugiyamaGraph containing them.
	 *
	 * @param <E> the type of the edge which should be wrapped
	 * @param <V> the type of the vertex the E connects
	 */
	public static class SugiyamaEdge<V extends Vertex,E extends DirectedEdge<V>> extends DirectedEdge<SugiyamaVertex<V>>
	{
		private SugiyamaEdge(E edge) {}
		
		public E getEdge() { return null; }
		
		private boolean isReversed() { return false; }
		
		private void setReversed(boolean rev) {}
		
		private boolean isReplaced() { return false; }
		
		private List<SupplementPath<V, E>> getSupplement() { return null; }
	}

}