package src3;

import src3.model.Service;
import src3.presenter.Presenter;
import src3.ui.Console;
import src3.ui.View;

public class Main {
    public static void main(String[] args) {
        View view = new Console();
        Service service = new Service();
        new Presenter(view, service);

        view.start();
    }
}
