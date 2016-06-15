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

	/**
	 * 
	 */
	private PluginManager() {
	}
	
	public static PluginManager getPluginManager() {
		if (mgr == null) {
			mgr = new PluginManager();
		}
		return mgr;
	}
	
	public void addWorkspaceOption(WorkspaceOption option) { }
	public List<WorkspaceOption> getWorkspaceOptions() { return null; }
	public void addExporter(Exporter exporter) { }
	public List<Exporter> getExporters() { return null; }
	public void addImporter(Importer importer) { }
	public List<Importer> getImporters() { return null; }
	public void addLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) { }
	public List<LayoutAlgorithm> getLayoutAlgorithms() { return null; }
	public List<Plugin> getPlugins() { return null; }
}
