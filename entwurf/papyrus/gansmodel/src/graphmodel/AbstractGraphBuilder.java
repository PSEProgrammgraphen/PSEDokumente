package graphmodel;

/**
 * This is an abstract interface which is used to build a concrete graph.  
 *
 */
public abstract class AbstractGraphBuilder {

	/**
	 * Returns the EdgeBuilder which is specified for this graph.
	 * 
	 * @return AbstractEdgeBuilder
	 */
	public abstract AbstractEdgeBuilder getEdgeBuilder();

	/**
	 * Returns the VertexBuilder which is specified for this graph.
	 * 
	 * @param vertexID 
	 * @return AbstractVertexBuilder
	 */
	public abstract AbstractVertexBuilder getVertexBuilder(String vertexID);

	/**
	 * This method is called, when the buildingprocess of the graph is finished.
	 * Then it builds the graph and returns it.
	 * 	 
	 * @return Graph
	 */
	public Graph build() { 
		// TODO Auto-generated method
		return null;
	 } 

}
