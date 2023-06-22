package src3.ui.commands;

import src3.ui.View;

public class AddHuman implements Command {
    private View view;

    public AddHuman(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Добавить";
    }

    @Override
    public void execute() {
        view.addHuman();
    }

}
