package plugin;

/**
 * An entry point option is an abstract superclass for all entry points, 
 * where the user can choose one of multiple entry points.
 * Entry point options should allow a categorical overview for the entry point, to enable
 * the client to differentiate the option from other options.
 * Additionally a method for should be provided which can be executed when the client wants to select an option.
 */
public abstract class EntryPointOption {

	private String name;
	private String id;

	/**
	 * Returns the name of the entry point option.
	 * This name can be displayed when displaying multiple options
	 * 
	 * @return the name
	 */
	public String getName() {return name;}
	protected void setName(String name) { this.name = name; }
	
	/**
	 * The ID of an entry point should be an acronym of it's name.
	 * @return the id
	 */
	public String getID() {return id;}
	protected void setID(String id) { this.id = id; }
}
