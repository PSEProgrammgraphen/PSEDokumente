package joana;

import java.util.List;

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
	 * Returns a list of all {@link FieldAcesses} in the MethodGraph.
	 * 
	 * @return A list of all {@link FieldAcesses} in the MethodGraph.
	 */
	public List<FieldAccess> getFieldAccesses() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Returns a list of all {@link MethodCall} in the MethodGraph.
	 * 
	 * @return A list of all {@link MethodCall} in the MethodGraph.
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
}
