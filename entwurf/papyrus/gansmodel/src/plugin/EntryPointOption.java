package plugin;

/**
 * @author Lucas
 *
 */
public abstract class EntryPointOption {

	private String name;
	private String id;

	public String getName() {return name;}
	protected void setName(String name) { this.name = name; }
	public String getID() {return id;}
	protected void setID(String id) { this.id = id; }
	public abstract void onChoose();
}
