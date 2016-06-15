package joana;

import java.util.List;

import plugin.LayoutOption;
import plugin.LayoutRegister;
import plugin.Plugin;
import plugin.PluginManager;
import plugin.Workspace;
import plugin.WorkspaceOption;

/**
 * @author Lucas
 */
public class JoanaPlugin implements Plugin {

	private CallGraphLayoutRegister cRegister;
	private MethodGraphLayoutRegister mRegister;

	private final static String pluginName = "JOANA";

	/**
	 * 
	 */
	public JoanaPlugin() {
	}

	/* (non-Javadoc)
	 * @see plugin.Plugin#getName()
	 */
	@Override
	public String getName() {
		return pluginName;
	}

	@Override
	public load() {
		// Example Workspace-Register
		PluginManager.getPluginManager().addWorkspaceOption(new WorkspaceOption() {

			{
				this.setName("JOANA-Workspace");
				this.setID("joana");
			}

			@Override
			public void onChoose() {
			}

			@Override
			public Workspace getInstance() {
				return new JoanaWorkspace();
			}
		});
	}
	
	public CallGraphLayoutRegister getCallGraphLayoutRegister() {return cRegister;}
	public MethodGraphLayoutRegister getMethodGraphLayoutRegister() {return mRegister;}
	
	public static class CallGraphLayoutRegister implements LayoutRegister<Callgraph>
	{ 
		@Override
		public void addLayoutOption(LayoutOption<Callgraph> option) { }

		@Override
		public List<LayoutOption<Callgraph>> getLayoutOptions() { return null; } 
	}

	public static class MethodGraphLayoutRegister implements LayoutRegister<MethodGraph>
	{
		@Override
		public void addLayoutOption(LayoutOption<MethodGraph> option) { }

		@Override
		public List<LayoutOption<MethodGraph>> getLayoutOptions() { return null; }
	}

}
