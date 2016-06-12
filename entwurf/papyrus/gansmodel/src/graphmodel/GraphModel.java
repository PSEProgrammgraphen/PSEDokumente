package graphmodel;

import java.util.List;

/**
 * A {@link GraphModel} contains one or more graphs.
 * It is used to save nested or hierachical graphs in one class 
 *
 */
public abstract class GraphModel {

	/**
	 * 
		 * Getter of graph
		 
	 * @return 
	 */
	public abstract List<Graph> getGraphs(); 

}
