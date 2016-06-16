package plugin;

import java.util.List;

/**
 * 
 */
public interface Plugin {
	
	/**
	 * Returns the name of the plugin.
	 * Uniqueness can't be assumed. 
	 * @return the name of the plugin
	 */
	public String getName();
	
	/**
	 * Called after all plugins have been constructed.
	 * "Inter-Plugin" communication, like registering of layouts for 
	 * graphs in other plugins should be executed in here.
	 */
	public void load();
	
	/**
	 * Returns all provided by the plugin {@link WorkspaceOption}.
	 * If none are provided returns {@code null} or an empty list.
	 * @return The list of provided workspace options
	 */
	public List<WorkspaceOption> getWorkspaceOptions();
	
	/**
	 * Returns all by the plugin provided {@link VertexFilter}.
	 * If none are provided returns {@code null} or an empty list.
	 * @return the list of provided vertex filter
	 */
	public List<VertexFilter> getVertexFilter();
	

	/**
	 * Returns all by the plugin provided {@link EdgeFilter}.
	 * If none are provided returns {@code null} or an empty list.
	 * @return the list of provided edge filter
	 */
	public List<EdgeFilter> getEdgeFilter();
}
