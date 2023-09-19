package HW;

import java.util.List;

public interface TaskList {
    void addTask(String task);
    void deleteTask(int index);
    List<String> getTaskList();
}
