package joana;


import java.util.ArrayList;
import java.util.List;

import org.omg.Dynamic.Parameter;

import graphmodel.Graph;
import parameter.IntegerParameter;
import parameter.MultipleChoiceParameter;
import parameter.Settings;
import parameter.StringParameter;
import plugin.LayoutAlgorithm;

public class MethodGraphLayout implements LayoutAlgorithm<MethodGraph> {

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

	@Override
	public String getName() {
		return "Methodgraph-Layout";
	}

	@Override
	public String getID() {
		return "mdg";
	}

	@Override
	public void onLoad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layout(MethodGraph graph) {
		// TODO Auto-generated method stub
		
	}

}
