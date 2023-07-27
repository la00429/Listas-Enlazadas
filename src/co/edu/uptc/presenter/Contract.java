package co.edu.uptc.presenter;

import co.edu.uptc.model.Node;

public interface Contract {
    public interface Presenter{
        void setModel(Model model);
        void setView(View view);

        void run();
    }

    public interface Model{
        void setPresenter(Presenter presenter);
        void addBefore(Node node);
        void addAfter(Node node);
        void removeIndex(int index);
        void removeRepeat();
    }

    public interface View{
        void setPresenter(Presenter presenter);
    }
}
