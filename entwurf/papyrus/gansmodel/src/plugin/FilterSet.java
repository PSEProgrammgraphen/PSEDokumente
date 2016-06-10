package plugin;

import java.util.List;

public interface FilterSet {

	/**
	 * 
	 * @return 
	 */
	public List<VertexFilter> getVertexfilter();

	/**
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * 
	 * @return 
	 */
	public List<EdgeFilter> getEdgeFilter(); 

}
