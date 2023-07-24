package co.edu.uptc.presenter;

import co.edu.uptc.model.ControlModel;
import co.edu.uptc.view.Console;

public class ManagerGeneral {
    private Contract.Presenter presenter;
    private Contract.Model model;
    private Contract.View view;

    public ManagerGeneral() {
    }

    private void CreateMVP(){
        presenter = new Presenter();
        model = new ControlModel();
        view = new Console();

        presenter.setModel(model);
        presenter.setView(view);
        model.setPresenter(presenter);
        view.setPresenter(presenter);
    }

    public void run(){
        CreateMVP();
        presenter.run();
    }

}
