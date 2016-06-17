package graphmodel;

import objectproperty.GAnsProperty;

/**
 * This is an DefaultVertex, which has basic functions and is provided by the mainapplication.
 * 
 *
 */
public class DefaultVertex implements Vertex {
	
	private GAnsProperty<String> name;
	private GAnsProperty<Integer> id;
	private GAnsProperty<String> label;
	private int x;
	private int y;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name.getPropertyValue();
	}

	@Override
	public Integer getID() {
		// TODO Auto-generated method stub
		return id.getPropertyValue();
	}
	
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return label.getPropertyValue();
	}

	@Override
	public void addToFastGraphAccessor(FastGraphAccessor fga) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SerializedVertex serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	} 

}
