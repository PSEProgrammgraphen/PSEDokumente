package graphmodel;

/**
 * An abstract interface, which is used to build a vertex.
 */
public interface IVertexBuilder {

	/**
	 * Add Data to this Vertex. The vertexBuilder decides which kind of data it
	 * is and where to save in the concrete Vertex.
	 * 
	 * 
	 * @param value
	 * @param keyname
	 */
	public abstract void addData(String value, String keyname);

	/**
	 * This method builds the concrete Vertex and returns it.
	 * 
	 * 
	 * @return Vertex
	 */
	public Vertex build();

	/**
	 * This method returns an specific GraphBuilder. This method is used to
	 * implement nested Graphs.
	 * 
	 * @param graphID
	 * @return
	 */
	public IGraphBuilder getGraphBuilder(String graphID);

}
