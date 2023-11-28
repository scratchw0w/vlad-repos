package hw;

public class Task {
    private String description;
    private boolean isCompleted;
    private String priority;

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void setCompleted() {
        this.isCompleted = true;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void showInfo() {
        System.out.println("hw.Task description: " + this.description);
        System.out.println("hw.Task priority: " + this.priority);
        System.out.println("hw.Task status: " + this.isCompleted);
        System.out.println();
    }
}
