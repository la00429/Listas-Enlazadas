package co.edu.uptc.presenter;

public interface Contract {
    public interface Presenter{
        void setModel(Model model);
        void setView(View view);

        void run();
    }

    public interface Model{
        void setPresenter(Presenter presenter);
    }

    public interface View{
        void setPresenter(Presenter presenter);
    }
}
