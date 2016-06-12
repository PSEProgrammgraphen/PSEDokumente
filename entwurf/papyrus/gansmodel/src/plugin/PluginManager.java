package plugin;

import java.util.List;
import java.util.ServiceLoader;

/**
 * @author Lucas
 *
 */
public class PluginManager {

	private List<WorkspaceOption> wOptions;
    private ServiceLoader<Plugin> loader;	

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
	public List<WorkspaceOption> getWorkspaceOption() { return null; }
	public List<Plugin> getPlugins() { return null; }
}
