package co.edu.uptc.view;

import co.edu.uptc.presenter.Contract;

public class Console implements Contract.View {
    private Contract.Presenter presenter;
    @Override
    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }
}
