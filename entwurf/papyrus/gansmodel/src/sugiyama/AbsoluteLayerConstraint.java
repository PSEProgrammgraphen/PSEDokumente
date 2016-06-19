/**
 * 
 */
package sugiyama;

import java.util.Set;

import plugin.Constraint;
import sugiyama.SugiyamaGraph.SugiyamaVertex;

/**
 * A absolute constraint, regarding layer assignment, for one set of vertices.
 * Can describe if one set of vertices should be placed in one layer, in a range of layers.
 * The constraint can be inverted, meaning it should not be placed on this layer.
 * Additionally an exact flag can be set to mark that only this set of vertices should be placed
 * on the selected range of layer.
 * Consequently inverted and exact means all other vertices have to be placed in this range of layers.
 */
public class AbsoluteLayerConstraint implements Constraint {
	
	private boolean inverted;
	private boolean exact;
	private Set<SugiyamaVertex> vertices;
	public AbsoluteLayerConstraint(Set<SugiyamaVertex> set, boolean inverted, boolean exact, int minLayer, int maxLayer) { }

	/* (non-Javadoc)
	 * @see plugin.Constraint#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
