package plugin;

import java.util.List;
import java.util.ServiceLoader;

/**
 * @author Lucas
 *
 */
public class PluginManager {

	private List<WorkspaceOption> workspaceOptions;
	private List<Importer> importers;
    private ServiceLoader<Plugin> loader;	
    private List<LayoutAlgorithm> layoutAlgorithms;

	private static PluginManager mgr;

	private PluginManager() {}
	
	/**
	 * Returns the singleton instance of the plugin manager.
	 * @return the plugin manager
	 */
	public static PluginManager getPluginManager() {
		if (mgr == null) {
			mgr = new PluginManager();
		}
		return mgr;
	}
	
	public void addExporter(Exporter exporter) { }
	public List<Exporter> getExporters() { return null; }
	public void addImporter(Importer importer) { }
	public List<Importer> getImporters() { return null; }

	/**
	 * Returns all {@link WorkspaceOption}s provided by plugins.
	 * @return a list of all workspace options
	 */
	public List<WorkspaceOption> getWorkspaceOptions() { return null; } 
	
	/**
	 * Returns all vertex filter provided by plugins.
	 * @return a list of all vertex filter
	 */
	public List<VertexFilter> getVertexFilter() { return null; }
	
	/**
	 * Returns a list of all edge filter provided by plugins.
	 * @return a list of all edge filter
	 */
	public List<EdgeFilter> getEdgeFilter() { return null; }
	
	/**
	 * Returns a list of all plugins loaded by the ServiceLoader.
	 * @return all loaded plugins
	 */
	public List<Plugin> getPlugins() { return null; }
}
