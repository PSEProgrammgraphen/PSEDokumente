/**
 * 
 */
package joana;

import plugin.LayoutAlgorithm;
import plugin.LayoutOption;

/**
 * A {@link LayoutOption} which is specific for {@link MethodGraph}.
 */
public abstract class MethodGraphLayoutOption extends LayoutOption {
	
	private MethodGraph graph;
	private LayoutAlgorithm<MethodGraph, JoanaVertex, JoanaEdge> layout;
	
	/**
	 * Sets the {@link MethodGraph} that will be the target of the CallGraphLayoutOption.
	 * 
	 * @param graph
	 *            The {@link MethodGraph} that will be the target of the
	 *            MethodGraphLayoutOption.
	 */
	public void setGraph(MethodGraph graph) {
	}

	/**
	 * Sets the LayoutAlgorithm that will be used to layout the set graph.
	 * 
	 * @param layout
	 *            The LayoutAlgorithm that will be used to layout the set graph.
	 */
	public void setLayout(LayoutAlgorithm<MethodGraph, JoanaVertex, JoanaEdge> layout) {
		this.layout = layout;
	}
	
	@Override
	public void applyLayout() {
		layout.layout(graph);
	}
}
