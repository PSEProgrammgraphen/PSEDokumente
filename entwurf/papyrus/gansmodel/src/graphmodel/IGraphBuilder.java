package graphmodel;

/**
 * This is an abstract interface which is used to build a concrete graph.  
 *
 */
public interface IGraphBuilder {

	/**
	 * Returns the EdgeBuilder which is specified for this graph.
	 * 
	 * @return AbstractEdgeBuilder
	 */
	public abstract IEdgeBuilder getEdgeBuilder();

	/**
	 * Returns the VertexBuilder which is specified for this graph.
	 * 
	 * @param vertexID 
	 * @return AbstractVertexBuilder
	 */
	public abstract IVertexBuilder getVertexBuilder(String vertexID);

	/**
	 * This method is called, when the buildingprocess of the graph is finished.
	 * Then it builds the graph and returns it.
	 * 	 
	 * @return Graph
	 */
	public Graph build();
}
