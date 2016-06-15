package plugin;

import parameter.Settings;
import graphmodel.IGraphModelBuilder;

import java.util.List;

import graphmodel.GraphModel;
import java.util.List;

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
	
	/**
	 * Returns all layout options for the specified graph.
	 * @param g the index of the graph in the model
	 * @return a list of layout options
	 */
	public List<LayoutOption> getLayoutOptions(int graphIndex);

}
