package src3.ui;

import src3.presenter.Presenter;

public interface View {
    void print(String text);
    void start();
    void setPresenter(Presenter presenter);

    void addHuman();
    void getHumanList();
    void finish();
}
