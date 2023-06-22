package src3.presenter;

import src3.model.Service;
import src3.ui.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addHuman(String firstName, String lastName){
        service.addHuman(firstName, lastName);
    }

    public void getHumanList(){
        view.print(service.getHumanList());
    }
}
