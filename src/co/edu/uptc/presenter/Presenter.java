package co.edu.uptc.presenter;

import co.edu.uptc.model.Node;

public class Presenter implements Contract.Presenter{
	private Contract.Model model;
	private Contract.View view;

	@Override
	public void setModel(Contract.Model model) {
		this.model = model;
	}

	@Override
	public void setView(Contract.View view) {
		this.view = view;
	}

	@Override
	public void run() {
		System.out.println("Hello world!");
	}
}
