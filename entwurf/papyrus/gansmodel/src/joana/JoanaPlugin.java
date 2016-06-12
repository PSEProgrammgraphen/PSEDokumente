/**
 * 
 */
package joana;

import plugin.Plugin;

/**
 * @author Lucas
 */
public class JoanaPlugin implements Plugin {

	private final static String pluginName = "JOANA";

	/**
	 * 
	 */
	public JoanaPlugin() {

	}

	/* (non-Javadoc)
	 * @see plugin.Plugin#getName()
	 */
	@Override
	public String getName() {
		return pluginName;
	}

}
