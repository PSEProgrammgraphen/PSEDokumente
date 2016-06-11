package parameter;

/**
 * An abstract visitor class, as described in the Visitor-Pattern.
 * Thought to give other elements access to a custom {@link Settings} and retrieve all informations
 * of the specialized {@link Parameter} interfaces.
 */
public abstract class ParameterVisitor { 

	/**
	 * Visits the specified parameter and performs some by the subclass chosen actions on it.
	 * @param parameter
	 * 		The parameter to visit
	 */
	public abstract void visit(IntegerParameter parameter);

	/**
	 * Visits the specified parameter and performs some by the subclass chosen actions on it.
	 * @param parameter
	 * 		The parameter to visit
	 */
	public abstract void visit(EnumerationParameter parameter);

	/**
	 * Visits the specified parameter and performs some by the subclass chosen actions on it.
	 * @param parameter
	 * 		The parameter to visit
	 */
	public abstract void visit(StringParameter parameter);

	/**
	 * Visits the specified parameter and performs some by the subclass chosen actions on it.
	 * @param parameter
	 * 		The parameter to visit
	 */
	public abstract void visit(MultipleChoiceParameter parameter);
}
