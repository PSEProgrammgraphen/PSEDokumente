package plugin;

import parameter.Settings;

/**
 * This is an option for a 
 * @author Lucas
 *
 */
public abstract class WorkspaceOption extends EntryPointOption {

	/**
	 * Creates an instance of the workspace with the earlier adjusted Settings
	 * @return a workspace
	 */
	public abstract Workspace getInstance();
	
	/**
	 * Returns a set of parameters to initialize a workspace for this.
	 * When the settings have been adjusted, the client has
	 * to call {@code getInstance()}, to get an instance of the workspace
	 * with the settings.
	 * @return the settings
	 */
	public abstract Settings getSettings();
}
