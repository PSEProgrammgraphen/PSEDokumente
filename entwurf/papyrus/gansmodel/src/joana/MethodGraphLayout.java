package joana;


import java.util.ArrayList;
import java.util.List;

import graphmodel.LayeredGraph;
import parameter.IntegerParameter;
import parameter.MultipleChoiceParameter;
import parameter.Settings;
import parameter.StringParameter;
import sugiyama.LayeredLayoutAlgorithm;

/**
 * Implements hierarchical layout with layers for {@link MethodGraph}.
 */
public class MethodGraphLayout implements LayeredLayoutAlgorithm<MethodGraph, JoanaVertex, JoanaEdge> {

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

	/**
	 * Layouts a single {@link MethodGraph} with the configured settings.
	 * 
	 * @param graph The {@link MethodGraph} to layout.
	 */
	public void layout(MethodGraph graph) { }

	@Override
	public void layoutLayeredGraph(LayeredGraph<JoanaVertex, JoanaEdge> graph) {
		// TODO Auto-generated method stub
		
	}
}
