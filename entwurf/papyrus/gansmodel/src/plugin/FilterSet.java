package plugin;

import java.util.List;

/**
 * A FilterSet is used to collect all available filters for a specific {@link Graph} from a workspace. 
 * Just these filters will be displayed to the user for a specific graph.
 */
public interface FilterSet {

	/**
	 * Returns a {@link List} of all available {@link VertexFilter}.
	 * 
	 * @return the list of VertexFilters
	 */
	public List<VertexFilter> getVertexfilter();

	/**
	 * Gets the name of this FilterSet.
	 * 
	 * @return name of this FilterSet
	 */
	public String getName();

	/**
	 * Returns a List of all available {@link EdgeFilter}
	 * 
	 * @return  the list of EdgeFilters
	 */
	public List<EdgeFilter> getEdgeFilter(); 

}
