package joana;

import java.util.List;
import java.util.Set;

import graphmodel.CompoundVertex;
import graphmodel.LayeredGraph;
import graphmodel.Vertex;
import plugin.LayoutOption;
import plugin.LayoutRegister;

/**
 * This is a specific graph representation for a MethodGraph in JOANA 
 */
public class MethodGraph extends JoanaGraph {

	private static LayoutRegister register;
	
	/**
	 * Returns the entry vertex of a method.
	 * 
	 * @return The entry vertex of a method.
	 */
	public JoanaVertex getEntryVertex() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Returns a list of all {@link FieldAccess} in the MethodGraph.
	 * 
	 * @return A list of all {@link FieldAccess} in the MethodGraph.
	 */
	public List<FieldAccess> getFieldAccesses() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Returns a list of all {@link JoanaVertex} which are method calls in the MethodGraph.
	 * 
	 * @return A list of all method calls.
	 */
	public List<JoanaVertex> getMethodCalls() { 
		// TODO Auto-generated method
		return null;
	 } 

	/**
	 * Sets the {@link LayoutRegister}, which stores the available 
	 * {@link LayoutOption} for all method graphs statically.
	 * @param register The {@link LayoutRegister} that will be set.
	 */
	protected static void setRegister(LayoutRegister register) {
		MethodGraph.register = register;
	}

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
