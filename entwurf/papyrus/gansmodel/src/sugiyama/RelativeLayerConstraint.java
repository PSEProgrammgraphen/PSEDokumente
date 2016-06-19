package sugiyama;

import java.util.Set;

import sugiyama.SugiyamaGraph.SugiyamaVertex;
import plugin.Constraint;

/**
 * A relative constraint, regarding layer assignment, between to sets of vertices.
 * Can describe if one set of vertices should be on top of the other.
 * When the exact is set a layer distance can be set.
 */
public class RelativeLayerConstraint implements Constraint
{
	private Set<SugiyamaVertex> top;
	private Set<SugiyamaVertex> bottom;
	private boolean exact;
	private int distance;
	private String name = "RelativeLayerConstraint";
	
	public RelativeLayerConstraint(Set<SugiyamaVertex> top, Set<SugiyamaVertex> bottom, boolean direct, int distance) {}
	
	/**
	 * Returns true if the constraints describes an exact distance between the two sets, false otherwise.
	 * @return true if exact
	 */
	public boolean isExact() { return exact; };
	
	/**
	 * Returns the distance the two sets should be apart, if this constraint is exact.
	 * @return the number of layers between the sets
	 * @throws IllegalStateException if the set is not exact
	 */
	public int getDistance() throws IllegalStateException {
		if (!exact)
			throw new IllegalStateException();
		return distance; 
    }
	
	/**
	 * Returns the set which should be on top.
	 * @return the top layer
	 */
	public Set<SugiyamaVertex> topSet() { return top; }
	
	/**
	 * Returns the set which should be below.
	 * @return the bottom layer
	 */
	public Set<SugiyamaVertex> bottomSet() { return bottom; }

	/**
	 * Returns the name of the layout constraint
	 */
	public String getName() {
		return name;
	}
	
}