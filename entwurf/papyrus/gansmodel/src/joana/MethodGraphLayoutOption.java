/**
 * 
 */
package joana;

import plugin.LayoutAlgorithm;
import plugin.LayoutOption;

/**
 *
 */
public abstract class MethodGraphLayoutOption extends LayoutOption {
	
	private MethodGraph graph;
	private LayoutAlgorithm<MethodGraph, JoanaVertex, JoanaEdge> layout;
	
	public void setGraph(MethodGraph g) {}

	public void setLayout(LayoutAlgorithm<MethodGraph, JoanaVertex, JoanaEdge> layout) { this.layout = layout; }
	
	@Override
	public void applyLayout() {
		layout.layout(graph);
	}
}
