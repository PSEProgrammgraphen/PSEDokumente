package graphmodel;

import java.util.List;

import plugin.LayoutOption;
import plugin.LayoutRegister;

/**
 * @author Lucas
 *
 */
public class DirectedGraphLayoutRegister implements LayoutRegister<DirectedGraphLayoutOption> {

	private List<LayoutOption> options;
	
	public DirectedGraphLayoutRegister() {}

	@Override
	public List<LayoutOption> getLayoutOptions() {
		return options;
	}

	@Override
	public void addLayoutOption(DirectedGraphLayoutOption option) {
		options.add(option);
		
	}

}
