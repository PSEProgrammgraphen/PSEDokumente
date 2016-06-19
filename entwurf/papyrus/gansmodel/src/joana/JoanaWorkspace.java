package joana;

import graphmodel.GraphModel;
import graphmodel.IGraphModelBuilder;
import parameter.Settings;
import plugin.Workspace;

/**
 * The {@link JoanaWorkspace} is the workspace for Joana graphs. It is used to
 * define parameters, provides an {@link IGraphModelBuilder} and contains a
 * {@link JoanaGraphModel}.
 */
public class JoanaWorkspace implements Workspace {

	@Override
	public void initialize() {
	}

	@Override
	public IGraphModelBuilder getGraphModelBuilder() {
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
