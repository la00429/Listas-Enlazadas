package co.edu.uptc.model;

import co.edu.uptc.presenter.Contract;

public class ControlModel implements Contract.Model{
    private Contract.Presenter presenter;
    @Override
    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }
}
