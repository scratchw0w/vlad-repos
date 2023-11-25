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

    public void setTaskAsCompleted(Task task) {
        for(Task currentTask: this.taskList){
            if(currentTask == task){
                currentTask.setCompleted(true);
                return;
            }
        }
    }

    public void setAllTasksAsCompleted(){
        this.taskList.forEach(task -> task.setCompleted(true));
    }

    public void showInfo(){
        this.taskList.forEach(Task::showInfo);
    }
}
