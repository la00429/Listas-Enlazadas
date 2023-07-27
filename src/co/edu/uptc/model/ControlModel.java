package co.edu.uptc.model;

import co.edu.uptc.presenter.Contract;

public class ControlModel implements Contract.Model{
	public List list;
	
    private Contract.Presenter presenter;
    @Override
    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

	@Override
	public void addBefore(Node node) {
		getList().addBefore(node);
		
	}

	@Override
	public void addAfter(Node node) {
		getList().addAfter(node);
		
	}

	@Override
	public void removeIndex(int index) {
		getList().removeIndex(index);
		
	}

	@Override
	public void removeRepeat() {
		getList().removeRepeat();
		
	} 
	
	public List getList() {
		return list;
	}
	
	
}
