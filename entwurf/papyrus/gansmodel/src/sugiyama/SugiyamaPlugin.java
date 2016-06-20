package sugiyama;

import java.util.List;

import plugin.EdgeFilter;
import plugin.Exporter;
import plugin.Importer;
import plugin.Plugin;
import plugin.VertexFilter;
import plugin.WorkspaceOption;

/**
 * A plugin for GAns that supplies a layout algorithm based on the Sugiyama-framework.
 */
public class SugiyamaPlugin implements Plugin {
	private String name;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
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
	public List<EdgeFilter> getEdgeFilter() {
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
}
