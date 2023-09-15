package HW;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements TaskList {

    private List<String> tasks = new ArrayList<>();

    @Override
    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public void deleteTask(int index) {
        tasks.remove(index);
    }

    @Override
    public void getTaskList() {
        for(int i = 0; i < tasks.size(); i++){
            System.out.println(tasks.get(i));
        }
    }
}
