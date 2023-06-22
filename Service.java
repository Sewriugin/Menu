package src3.model;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<String> list;

    public Service() {
        list = new ArrayList<>();
        list.add("Иван Иванович");
        list.add("Петр Петрович");
        list.add("Семен Семенович");
    }

    public void addHuman(String firstName, String lastName){
        list.add(firstName + " " + lastName);
    }

    public String getHumanList(){
        return list.toString();
    }
}
