package plugin;

import java.util.List;

/**
 * A FilterSet is used to collect all available filters for a specific {@link Graph} from a workspace. 
 * Just these filters will be displayed to the user for a specific graph
 */
public interface FilterSet {

	/**
	 * Returns a Set of all available {@link VertexFilter}.
	 * 
	 * @return 
	 */
	public List<VertexFilter> getVertexfilter();

	/**
	 * Get the name of this FilterSet
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * Returns a Set of all available {@link EdgeFilter}
	 * 
	 * @return 
	 */
	public List<EdgeFilter> getEdgeFilter(); 

}
