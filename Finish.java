package src3.ui.commands;

import src3.ui.View;

public class Finish implements Command {
    private View view;

    public Finish(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Завершить работу";
    }

    @Override
    public void execute() {
        view.finish();
    }
}
