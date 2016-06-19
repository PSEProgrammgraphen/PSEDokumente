package joana;

import java.util.List;
import java.util.Set;

import graphmodel.CompoundVertex;
import graphmodel.LayeredGraph;
import graphmodel.Vertex;

/**
 * This is a specified graph representation for the Callgraph in Joana.
 */
public class CallGraph extends JoanaGraph {

	@Override
	public CompoundVertex collapse(Set<JoanaVertex> subset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<JoanaVertex> expand(CompoundVertex vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCompound(Vertex vertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLayerWidth(int layerN) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<LayeredGraph<JoanaVertex, JoanaEdge>> getSubgraphs() {
		// TODO Auto-generated method stub
		return null;
	}
}
