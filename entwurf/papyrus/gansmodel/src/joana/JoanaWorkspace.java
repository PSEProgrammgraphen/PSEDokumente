package joana;

import plugin.Workspace;
import parameter.Settings;
import graphmodel.AbstractGraphModelBuilder;
import graphmodel.GraphModel;

/**
 * The {@link JoanaWorkspace} is the workspace for Joana graphs
 * It is used to define parameters, and also contains an {@link AbstractGraphBuilder} and a {@link GraphModel}
 *
 */
public class JoanaWorkspace implements Workspace {

	/**
	 * 
	 */
	public JoanaWorkspace() { }

	/**
	 * 
	 * @return 
	 */
	public Settings getParameterSet() { 
		// TODO Auto-generated method
		return null;
	 }

	@Override
	public void initialize(Settings parameters) {
		// TODO Auto-generated method stub
	} 


	/**
	 * 
	 * @return 
	 */
	public AbstractGraphModelBuilder getGraphModelBuilder() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @return 
	 */
	public GraphModel getGraphModel() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 */
	public void getParameterDialog() { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @return 
	 */
	public String getName() { 
		// TODO Auto-generated method
		return null;
	 }
}