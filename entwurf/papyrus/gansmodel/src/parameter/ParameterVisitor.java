package parameter;

public abstract class ParameterVisitor { 

	public abstract void visit(IntegerParameter parameter);
	public abstract void visit(EnumerationParameter parameter);
	public abstract void visit(StringParameter parameter);
	public abstract void visit(MultipleChoiceParameter parameter);
}
