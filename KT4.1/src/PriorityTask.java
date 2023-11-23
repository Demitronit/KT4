public class PriorityTask extends Task implements Comparable<PriorityTask> {
    private String priority;


    public PriorityTask(String name, String description, String priority) {
        super(name, description);
        this.priority = priority;
    }


    @Override
    public int compareTo(PriorityTask otherTask) {
        // Возвращаем результат сравнения строк приоритетов
        return this.priority.compareTo(otherTask.getPriority());
    }


    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}