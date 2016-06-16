/**
 * 
 */
package plugin;

import java.util.List;

/**
 * Stores a collection of layouts.
 * This 
 */
public interface LayoutRegister<E extends LayoutOption> {
	
	public void addLayoutOption(E option);
	public List<LayoutOption> getLayoutOptions();
}
