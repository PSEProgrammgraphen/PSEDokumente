package joana;

import java.util.List;

import parameter.Settings;
import plugin.EdgeFilter;
import plugin.Exporter;
import plugin.Importer;
import plugin.LayoutOption;
import plugin.LayoutRegister;
import plugin.Plugin;
import plugin.VertexFilter;
import plugin.Workspace;
import plugin.WorkspaceOption;

/**
 * A plugin for GAns that supports the creation and visualization of Joana
 * system dependence graphs.
 */
public class JoanaPlugin implements Plugin {

	private static CallGraphLayoutRegister cRegister;
	private static MethodGraphLayoutRegister mRegister;

	private final static String pluginName = "JOANA";

	private List<WorkspaceOption> wsOptions;

	/**
	 * Constructor. The constructor is called by the ServiceLoader.
	 */
	public JoanaPlugin() {
		WorkspaceOption joanaws = new WorkspaceOption() {

			{
				this.setName("JOANA-Workspace");
				this.setID("joana");
				this.ws = new JoanaWorkspace();
			}

			JoanaWorkspace ws;

			@Override
			public Workspace getInstance() {
				ws.initialize();
				return ws;
			}

			@Override
			public Settings getSettings() {
				return this.ws.getSettings();
			}
		};
		wsOptions.add(joanaws);
	}

	@Override
	public String getName() {
		return pluginName;
	}

	@Override
	public void load() {
	}

	@Override
	public List<WorkspaceOption> getWorkspaceOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VertexFilter> getVertexFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exporter> getExporter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Importer> getImporter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EdgeFilter> getEdgeFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	public static CallGraphLayoutRegister getCallGraphLayoutRegister() {
		return cRegister;
	}

	public static MethodGraphLayoutRegister getMethodGraphLayoutRegister() {
		return mRegister;
	}

	public static class CallGraphLayoutRegister implements LayoutRegister<CallGraphLayoutOption> {
		@Override
		public void addLayoutOption(CallGraphLayoutOption option) {
		}

		@Override
		public List<LayoutOption> getLayoutOptions() {
			return null;
		}
	}

	public static class MethodGraphLayoutRegister implements LayoutRegister<MethodGraphLayoutOption> {
		@Override
		public void addLayoutOption(MethodGraphLayoutOption option) {
			// TODO Auto-generated method stub
		}

		@Override
		public List<LayoutOption> getLayoutOptions() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
