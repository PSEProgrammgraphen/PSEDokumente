package com.tinkerpop.blueprints.util.io.graphml;

import java.util.List;

import plugin.EdgeFilter;
import plugin.Exporter;
import plugin.Importer;
import plugin.Plugin;
import plugin.VertexFilter;
import plugin.WorkspaceOption;

/**
 * This is the entry point for the {@link GraphMLImporter}-plugin.
 * It provides the Importer to the plugin manager
 * 
 */
public class GmlImporterPlugin implements Plugin {
	private String name;

	/**
	 * Getter of the name
	 * 
	 * @return the name of this plugin
	 */
	public String getName() {
		return this.name;
	}

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
