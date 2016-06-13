package gui;

import java.util.LinkedList;

import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.MultipleSelectionModel;
import objectproperty.GAnsProperty;

/**
 * The selection model for the {@link GraphView}, that supports multiple
 * selection of vertices and edges.
 * 
 * @author Nicolas
 */
public class GraphViewSelectionModel extends MultipleSelectionModel<GAnsGraphElement> {
	
	private LinkedList<ChangeListener<GAnsGraphElement> > listenerList;

	/**
	 * Returns the {@link GAnsProperty} of all selected items.
	 * 
	 * @return A list with all the {@link GAnsProperty} of all selected items.
	 */
	public ObservableList<GAnsProperty> getSelectedItemsProperties() {
		// TODO: diese Funktion wird vom listener aufgerufen der auf ein changed
		// des Selectionmodel hoert und �bergibt diese liste an die
		// informationview
		return null;
	}
	
	public void addListener(ChangeListener<GAnsGraphElement> listener) {
		listenerList.add(listener);
	}
	
	@Override
	public ObservableList<Integer> getSelectedIndices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservableList<GAnsGraphElement> getSelectedItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectIndices(int index, int... indices) {
		// TODO Auto-generated method stub
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public void selectFirst() {
		// TODO Auto-generated method stub
	}

	@Override
	public void selectLast() {
		// TODO Auto-generated method stub
	}

	@Override
	public void clearAndSelect(int index) {
		// TODO Auto-generated method stub
	}

	@Override
	public void select(int index) {
		// TODO Auto-generated method stub
	}

	@Override
	public void select(GAnsGraphElement obj) {
		// TODO Auto-generated method stub
	}

	@Override
	public void clearSelection(int index) {
		// TODO Auto-generated method stub
	}

	@Override
	public void clearSelection() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isSelected(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void selectPrevious() {
		// TODO Auto-generated method stub
	}

	@Override
	public void selectNext() {
		// TODO Auto-generated method stub
	}
}