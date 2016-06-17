package joana;

import graphmodel.DirectedEdge;
import objectproperty.GAnsProperty;

/**
 * This is the Joana specified Edge. It contains parameters which are only
 * useful for Joana
 * 
 */
public class JoanaEdge extends DirectedEdge<JoanaVertex> {

	private GAnsProperty<String> edgeKind;

	/**
	 * Returns the edgeKind of the JoanaEdge.
	 * 
	 * @return The edgeKind of the JoanaEdge.
	 */
	public String getEdgeKind() {
		return edgeKind.getPropertyValue();
	}

}
