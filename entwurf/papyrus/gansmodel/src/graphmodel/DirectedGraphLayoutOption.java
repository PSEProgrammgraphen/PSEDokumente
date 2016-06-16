package graphmodel;

import parameter.Settings;
import plugin.LayoutOption;

/**
 *
 */
public abstract class DirectedGraphLayoutOption extends LayoutOption {
	
	public void setGraph(DirectedGraph<? extends Vertex, ? extends DirectedEdge<? extends Vertex>> graph) {}
}
