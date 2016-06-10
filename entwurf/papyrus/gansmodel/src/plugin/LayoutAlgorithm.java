package plugin;

import java.util.List;
import parameter.Parameter;

public interface LayoutAlgorithm {

	/**
	 * 
	 */
	public void getParameterDialog();

	/**
	 * 
	 * @return 
	 */
	public List<Parameter> getParameterSet();

	public void initialize(List<Parameter> parameters);

	/**
	 * 
	 */
	public void onLoad(); 

}
