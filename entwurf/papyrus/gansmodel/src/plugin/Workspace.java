package plugin;

import parameter.Parameter;
import graphmodel.AbstractGraphModelBuilder;
import graphmodel.GraphModel;

public interface Workspace {

	/**
	 * 
	 * @param parameters 
	 * @return 
	 */
	public Workspace initialize(Parameter parameters);

	/**
	 * 
	 * @return 
	 */
	public AbstractGraphModelBuilder getGraphModelBuilder();

	/**
	 * 
	 * @return 
	 */
	public GraphModel getGraphModel();

	/**
	 * 
	 */
	public void getParameterDialog();

	/**
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * 
	 * @return 
	 */
	public Parameter getParameterSet(); 

}
