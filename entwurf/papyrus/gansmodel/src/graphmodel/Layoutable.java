package graphmodel;

import java.util.List;

import plugin.LayoutAlgorithm;
import plugin.LayoutOption;

public interface Layoutable<G extends Graph> {

	/**
	 * 
	 */
	public List<LayoutOption<G>> getRegisteredLayouts();
	
	public void applyLayout(LayoutAlgorithm<G> alg);
}
