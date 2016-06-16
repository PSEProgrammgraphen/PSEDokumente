package joana;

import plugin.LayoutOption;
import java.util.List;
import plugin.Workspace;
import parameter.Settings;
import graphmodel.IGraphModelBuilder;
import graphmodel.GraphModel;

/**
 * The {@link JoanaWorkspace} is the workspace for Joana graphs
 * It is used to define parameters, and also provides an {@link IGraphModelBuilder} and contains a {@link JoanaGraphModel}
 *
 */
public class JoanaWorkspace implements Workspace {

	public JoanaWorkspace() { }


	@Override
	public void initialize() {} 

	@Override
	public IGraphModelBuilder getGraphModelBuilder() { 
		return null;
	 }

	@Override
	public List<LayoutOption> getLayoutOptions(int graphIndex) {
		return null;
	}

	@Override
	public GraphModel getGraphModel() {
		return null;
	}

	@Override
	public Settings getSettings() {
		return null;
	}
}
