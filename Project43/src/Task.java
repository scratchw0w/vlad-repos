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

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
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
        System.out.println("Task description: " + this.description);
        System.out.println("Task priority: " + this.priority);
        System.out.println("Task status: " + this.isCompleted);
        System.out.println();
    }
}
