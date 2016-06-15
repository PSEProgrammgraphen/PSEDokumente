package graphmodel;


/**
 * This is an abstract interface, which builds a concrete graphmodel.
 * This Class is based on the Builder Pattern.
 *
 */

public interface IGraphModelBuilder {

	/**
	 * Returns a specific {@link AbstractGraphBuilder} which belongs to the graphmodel.
	 * It should also decide which graph should be builded with the help of the graphID.
	 * 
	 * @param graphID 
	 * @return 
	 */
	public abstract IGraphBuilder getGraphBuilder(String graphID);

	/**
	 * This method is called, when the buildingprocess of the graphmodel is finished.
	 * It returns the finished graphmodel
	 * 
	 * @return GraphModel
	 */
	public GraphModel build();

}