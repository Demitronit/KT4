import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList;


    public TaskManager() {
        taskList = new ArrayList<>();
    }


    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    public void markTaskAsCompleted(Task task) {
        task.setCompleted(true);
    }

    public void markTaskAsIncomplete(Task task) {
        task.setCompleted(false);
    }

    public List<Task> getTaskList() {
        return taskList;
    }
}