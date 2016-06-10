package graphmodel;

public abstract class AbstractVertexBuilder {

	/**
	 * 
	 * @param id 
	 */
	public abstract void newVertex(String id);

	/**
	 * 
	 * @param value 
	 * @param keyname 
	 */
	public abstract void addData(String value, String keyname);

	/**
	 * 
	 * @return 
	 */
	public Vertex build() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @param graphID 
	 * @return 
	 */
	public AbstractGraphBuilder getGraphBuilder(String graphID) { 
		// TODO Auto-generated method
		return null;
	 } 

}
