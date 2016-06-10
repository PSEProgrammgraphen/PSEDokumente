package graphmodel;

public abstract class AbstractGraphBuilder {

	/**
	 * 
	 * @return 
	 */
	public abstract AbstractEdgeBuilder getEdgeBuilder();

	/**
	 * 
		 * 
		 
	 * @param id 
	 * @return 
	 */
	public String newVertex(String id) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @param vertexID 
	 * @return 
	 */
	public abstract AbstractVertexBuilder getVertexBuilder(String vertexID);

	/**
	 * 
		 * 
		 * @return 
		 
	 * @return 
	 */
	public Graph build() { 
		// TODO Auto-generated method
		return null;
	 } 

}
