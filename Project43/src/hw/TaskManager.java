package hw;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    public List<Task> getTaskList() {
        return this.taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public void removeTask(Task task) {
        this.taskList.remove(task);
    }

    public boolean setTaskAsCompleted(Task task) {
        return this.taskList.stream()
                .filter(currentTask -> currentTask.equals(task))
                .peek(Task::setCompleted)
                .findAny()
                .isPresent();
    }

    public void setAllTasksAsCompleted() {
        this.taskList.forEach(Task::setCompleted);
    }

    public void showInfo() {
        this.taskList.forEach(Task::showInfo);
    }
}
