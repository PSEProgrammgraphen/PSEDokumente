package joana;

import graphmodel.DefaultVertex;
import objectproperty.GAnsProperty;

/**
 * This is the Joana specified Vertex. It contains parameters which are only
 * useful for Joana.
 */
public class JoanaVertex extends DefaultVertex {

	private GAnsProperty<String> nodeKind;
	private GAnsProperty<String> nodeSource;
	private GAnsProperty<Integer> nodeProc;
	private GAnsProperty<String> nodeOperation;
	private GAnsProperty<String> nodeBcName;
	private GAnsProperty<Integer> nodeBCIndex;
	private GAnsProperty<Integer> nodeSr;
	private GAnsProperty<Integer> nodeSc;
	private GAnsProperty<Integer> nodeEr;
	private GAnsProperty<Integer> nodeEc;

	/**
	 * Returns the nodeKind of the JoanaVertex.
	 * 
	 * @return The nodeKind of the JoanaVertex.
	 */
	public String getNodeKind() {
		return nodeKind.getPropertyValue();
	}

	/**
	 * Returns the nodeSource of the JoanaVertex.
	 * 
	 * @return The nodeSource of the JoanaVertex.
	 */
	public String getNodeSource() {
		return nodeSource.getPropertyValue();
	}

	/**
	 * Returns the nodeProc of the JoanaVertex.
	 * 
	 * @return The nodeProc of the JoanaVertex.
	 */
	public Integer getNodeProc() {
		return nodeProc.getPropertyValue();
	}

	/**
	 * Returns the nodeOperation of the JoanaVertex.
	 * 
	 * @return The nodeOperation of the JoanaVertex.
	 */
	public String getNodeOperation() {
		return nodeOperation.getPropertyValue();
	}

	/**
	 * Returns the nodeBcName of the JoanaVertex.
	 * 
	 * @return The nodeBcName of the JoanaVertex.
	 */
	public String getNodeBcName() {
		return nodeBcName.getPropertyValue();
	}

	/**
	 * Returns the nodeBCIndex of the JoanaVertex.
	 * 
	 * @return The nodeBCIndex of the JoanaVertex.
	 */
	public Integer getNodeBCIndex() {
		return nodeBCIndex.getPropertyValue();
	}

	/**
	 * Returns the nodeSr of the JoanaVertex.
	 * 
	 * @return The nodeSr of the JoanaVertex.
	 */
	public Integer getNodeSr() {
		return nodeSr.getPropertyValue();
	}

	/**
	 * Returns the nodeSc of the JoanaVertex.
	 * 
	 * @return The nodeSc of the JoanaVertex.
	 */
	public Integer getNodeSc() {
		return nodeSc.getPropertyValue();
	}

	/**
	 * Returns the nodeEr of the JoanaVertex.
	 * 
	 * @return The nodeEr of the JoanaVertex.
	 */
	public Integer getNodeEr() {
		return nodeEr.getPropertyValue();
	}

	/**
	 * Returns the nodeEc of the JoanaVertex.
	 * 
	 * @return The nodeEc of the JoanaVertex.
	 */
	public Integer getNodeEc() {
		return nodeEc.getPropertyValue();
	}
}
