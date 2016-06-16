/**
 * 
 */
package joana;

import plugin.LayoutAlgorithm;
import plugin.LayoutOption;

/**
 *
 */
public abstract class CallGraphLayoutOption  extends LayoutOption {

	private Callgraph graph;
	private LayoutAlgorithm<Callgraph, JoanaVertex, JoanaEdge> layout;
	
	public void setGraph(Callgraph g) {}

	public void setLayout(LayoutAlgorithm<Callgraph, JoanaVertex, JoanaEdge> layout) { this.layout = layout; }
	
	@Override
	public void applyLayout() {
		layout.layout(graph);
	}
}
