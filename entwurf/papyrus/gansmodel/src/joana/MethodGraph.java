package joana;

import java.util.List;

import plugin.LayoutOption;
import plugin.LayoutRegister;

/**
 * This is a specified graph representation for a MethodGraph in JOANA 
 */
public class MethodGraph extends JoanaGraph {

	private static LayoutRegister register;
	
	public MethodGraph() {}
	
	/**
	 * Get the entry vertex of a method
	 * 
	 * @return 
	 */
	public JoanaVertex getEntryVertex() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Get a list of all {@link FieldAcesses} in a method
	 * 
	 * @return 
	 */
	public List<FieldAccess> getFieldAccesses() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	 * @return 
	 */
	public List<JoanaVertex> getFormVertices() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Get a list of all MethodCalls in a method
	 * 
	 * @return 
	 */
	public List<JoanaVertex> getMethodCalls() { 
		// TODO Auto-generated method
		return null;
	 } 

	/**
	 * This sets the {@link LayoutRegister}, which stores the available 
	 * {@link LayoutOption}s for all method graphs statically.
	 * @param register the register
	 */
	protected static void setRegister(LayoutRegister register) {MethodGraph.register = register;}
	
}
