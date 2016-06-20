package sugiyama;

import java.util.List;
import java.util.Map;
import java.util.Set;

import graphmodel.DefaultVertex;
import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.FastGraphAccessor;
import graphmodel.LayeredGraph;
import graphmodel.Vertex;


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
	implements ICycleRemoverGraph, 
			   ILayerAssignerGraph,
			   ICrossMinimizerGraph,
			   IVertexPositionerGraph,
			   IEdgeDrawerGraph
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
	 * Replaces the specified edge with a path of dummy vertices of the specified length.
	 * Replaced edges are removed from the set of edges but saved for later retrieval 
	 * with {@code getReplacedEdges()} or restored with {@code restoreReplacedEdges}.
	 * 
	 * @param edge the edge to be replaced
	 * @param length the length of the path which replaces the edge
	 */
	private void replaceWithSupplementPath(SugiyamaEdge edge, int length) {}

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
	public void reverseEdge(SugiyamaEdge edge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isReversed(SugiyamaEdge edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void swapVertices(SugiyamaVertex first, SugiyamaVertex second) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLayer(SugiyamaVertex vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SugiyamaVertex> getLayer(int layerNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<SugiyamaVertex>> getLayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEdgeCorner(SugiyamaEdge edge, int x, int y, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEdgeCorner(SugiyamaEdge edge, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<graphmodel.EdgePath.Point> getEdgeCorners(SugiyamaEdge edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLayerY(int layerN, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setX(SugiyamaVertex vertex, int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignToLayer(SugiyamaVertex vertex, int layerNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<SugiyamaEdge> edgesOf(SugiyamaVertex vertex) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer outdegreeOf(SugiyamaVertex vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer indegreeOf(SugiyamaVertex vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SugiyamaEdge> incomingEdgesOf(SugiyamaVertex vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SugiyamaVertex> getVertexSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SugiyamaEdge> getEdgeSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addToFastGraphAccessor(FastGraphAccessor fga) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<SugiyamaEdge> getReversedEdges() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getName() {
		// Is not needed in this graph.
		return graph.getName();
	}

	@Override
	public Integer getID() {
		// Is not needed in this graph.
		return graph.getID();
	}

	@Override
	public Set<SugiyamaEdge> outgoingEdgesOf(SugiyamaVertex vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHeight() { return 0; }

	@Override
	public int getMaxWidth() { return 0; }

	@Override
	public Set<SugiyamaEdge> restoreAllEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SugiyamaEdge> getReplacedEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SugiyamaEdge> restoreReplacedEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLayerWidth(int layerN) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<LayeredGraph<SugiyamaVertex, SugiyamaEdge>> getSubgraphs() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * A supplement path for connecting vertices, which are more than one layer apart.
	 * They are stored in the SugiyamaEdge along with the substituted edge.
	 */
	public static class SupplementPath extends DirectedEdge<DummyVertex>
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
		public List<DummyVertex> getDummyVertices() {return null;}
		
		/**
		 * Returns the list of edges on the path from source to target
		 * @return the edges
		 */
		public List<SupplementEdge> getEdges() {return null;}
		
		/**
		 * Returns the edge which is substituted by this path
		 * @return the replaced edge
		 */
		//public E getReplacedEdge() {return null;}
	}
	/**
	 * A supplement edge which is part of a {@link SupplementPath}.
	 */
	public static class SupplementEdge extends DirectedEdge<DefaultVertex> {}
	
	/**
	 * A supplement vertex which is part of a {@link SupplementPath}.
	 */
	public static class DummyVertex extends DefaultVertex {}
	
	
	public static class SugiyamaVertex extends DefaultVertex
	{
		public boolean isDummyVertex() {return false;}
		//private V getVertex() {return null;}
		
	}

	/**
	 * A wrapper class for directed edges to implement additional functionality
	 * to apply the sugiyama layout to the SugiyamaGraph containing them.
	 */
	public static class SugiyamaEdge extends DirectedEdge<SugiyamaVertex>
	{
		private SugiyamaEdge() {}
		
		//private E getEdge() { return null; }
		
		private boolean isReversed() { return false; }
		
		private void setReversed(boolean rev) {}
		
		private boolean isReplaced() { return false; }
		
		private List<SupplementPath> getSupplement() { return null; }
	}
}
