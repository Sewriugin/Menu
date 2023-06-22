package src3.ui.commands;

import src3.ui.View;

public class GetHumanList implements Command {
    private View view;

    public GetHumanList(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Получить список";
    }

    @Override
    public void execute() {
        view.getHumanList();
    }
}
