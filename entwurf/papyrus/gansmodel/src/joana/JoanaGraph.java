package joana;

import graphmodel.DirectedGraph;

/**
 * An abstract superclass for all JOANA graphs.
 * 
 */
public abstract class JoanaGraph<G extends JoanaGraph<G>> extends DirectedGraph<G, JoanaVertex, JoanaEdge> {

}
