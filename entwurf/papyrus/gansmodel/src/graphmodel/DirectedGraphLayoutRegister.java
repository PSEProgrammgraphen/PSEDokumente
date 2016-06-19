package graphmodel;

import java.util.List;

import plugin.LayoutOption;
import plugin.LayoutRegister;

/**
 * A {@link LayoutRegister} which is specific for
 * {@link DirectedGraphLayoutOption}.
 */
public class DirectedGraphLayoutRegister implements LayoutRegister<DirectedGraphLayoutOption> {

	private List<LayoutOption> options;

	@Override
	public List<LayoutOption> getLayoutOptions() {
		return options;
	}

	@Override
	public void addLayoutOption(DirectedGraphLayoutOption option) {
		options.add(option);

	}

}
