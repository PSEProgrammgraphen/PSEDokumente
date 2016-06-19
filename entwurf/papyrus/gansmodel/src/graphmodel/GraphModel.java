package graphmodel;

import java.util.List;

/**
 * A GraphModel contains one or more graphs. It is used to save nested or
 * hierachical graphs in one class.
 */
public abstract class GraphModel {

	/**
	 * Returns all {@link Graph} contained in the GraphModel.
	 * 
	 * @return A list of all the {@link Graph} contained in the GraphModel.
	 */
	public abstract List<Graph> getGraphs();

}
