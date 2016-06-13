package graphmodel;

import java.util.List;

import plugin.LayoutAlgorithm;
import plugin.LayoutOption;


public interface Layoutable<G extends Graph<V, E>, V extends Vertex, E extends Edge<V>> {

	/**
	 * 
	 */
	public List<LayoutOption<G>> getRegisteredLayouts();
	
	public void applyLayout(LayoutAlgorithm<G, V, E> alg);
}
