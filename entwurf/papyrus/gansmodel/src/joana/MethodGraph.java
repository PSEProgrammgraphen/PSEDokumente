package joana;

import plugin.LayoutAlgorithm;

import java.util.List;

/**
 * This is a specified graph representation for a MethodGraph in JOANA 
 */
public class MethodGraph extends JoanaGraph<MethodGraph> {

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
	
	@Override
	public void applyLayout(LayoutAlgorithm<MethodGraph> alg) {
		alg.layout(this);
	}
}
