package joana;


import java.util.ArrayList;
import java.util.List;

import parameter.IntegerParameter;
import parameter.MultipleChoiceParameter;
import parameter.Settings;
import parameter.StringParameter;
import sugiyama.SugiyamaLayoutAlgorithm;

public class MethodGraphLayout extends SugiyamaLayoutAlgorithm {

	@Override
	public void getParameterDialog() { }

	@Override
	public Settings getSettings() {

		IntegerParameter p1 = new IntegerParameter("Max-Layer-Count", 20, 1, 100);
		IntegerParameter p2 = new IntegerParameter("Min-Layer-Count", 5, 1, 100);
		StringParameter p3 = new StringParameter("StringParameter", "Hallo");
		List<String> options = new ArrayList<String>();
		options.add("option1");
		options.add("option2");
		options.add("option3");
		MultipleChoiceParameter p4 = new MultipleChoiceParameter("Multiple-Choice-Test", options, 2);
		Settings  s = new Settings();
		s.addParameter(p1.getName(), p1);
		s.addParameter(p2.getName(), p2);
		s.addParameter(p3.getName(), p3);
		s.addParameter(p4.getName(), p4);
		return s;
	}

	public void layout(MethodGraph graph) {
		System.out.println("Layouting MethodGraph!");
		
	}

	public void layout(FieldAccess graph) {
		System.out.println("Layouting FieldAccess!");
	}
	
	public void layout(MethodCall graph) {
		System.out.println("Layouting MethodCall!");
	}
}
