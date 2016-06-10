package parameter;

import javafx.beans.property.SimpleBooleanProperty;
import java.beans.EventHandler;

public abstract class Parameter {

	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private final SimpleBooleanProperty enabled;
	/**
	 * 
	 */
	private EventHandler handler;
	/**
	 * 
	 * @return 
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * 
	 * @param name 
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * 
	 * @return 
	 */
	public String getDescription() {
	 	 return description; 
	}
	/**
	 * 
	 * @param description 
	 */
	public void setDescription(String description) { 
		 this.description = description; 
	}
	/**
	 * Getter of enabled
	 */
	public SimpleBooleanProperty getEnabled() {
	 	 return enabled; 
	}
	/**
	 * Setter of enabled
	 */
	public void setEnabled(SimpleBooleanProperty enabled) { 
		 this.enabled = enabled; 
	}
	/**
	 * Getter of handler
	 */
	public EventHandler getHandler() {
	 	 return handler; 
	}
	/**
	 * Setter of handler
	 */
	public void setHandler(EventHandler handler) { 
		 this.handler = handler; 
	}
	/**
	 * 
	 * @param handler 
	 */
	public abstract void onValueChange(EventHandler handler);
	/**
	 * 
	 * @return 
	 */
	public boolean isEnabled() { 
		// TODO Auto-generated method
		return false;
	 }
	/**
	 * 
	 * @param visitor 
	 */
	public abstract void acceptParameterVisitor(ParameterVisitor visitor);
	/**
	 * 
	 * @return 
	 */
	public SimpleBooleanProperty getEnabledProperty() { 
		// TODO Auto-generated method
		return null;
	 } 

}
