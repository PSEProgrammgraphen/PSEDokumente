package plugin;

import parameter.Settings;
import graphmodel.IGraphModelBuilder;
import graphmodel.GraphModel;

public interface Workspace {

	/**
	 * 
	 * @param parameters 
	 * @return 
	 */
	public void initialize(Settings parameters);

	/**
	 * 
	 * @return 
	 */
	public IGraphModelBuilder getGraphModelBuilder();

	/**
	 * 
	 * @return 
	 */
	public GraphModel getGraphModel();

	/**
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * 
	 * @return 
	 */
	public Settings getParameterSet(); 

}
