package co.edu.uptc.model;

import co.edu.uptc.presenter.Contract;

public class ControlModel implements Contract.Model{
    private Contract.Presenter presenter;
    @Override
    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }
    
    public void setValue(Object value) {
    	Node node = new Node(value);
	}
    
    public void insert() {
		
	}

    public void add() {
		
	}
    
    public void remove() {
		
	} 
}
