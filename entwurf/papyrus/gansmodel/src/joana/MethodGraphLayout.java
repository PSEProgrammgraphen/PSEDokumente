package joana;


import org.omg.Dynamic.Parameter;

import graphmodel.Graph;
import parameter.IntegerParameter;
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
		Settings  s = new Settings();
		s.addParameter(p1.getName(), p1);
		s.addParameter(p2.getName(), p2);
		s.addParameter(p3.getName(), p3);
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
