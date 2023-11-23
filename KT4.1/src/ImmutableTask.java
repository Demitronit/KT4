public final class ImmutableTask {
    private final String name;
    private final String description;
    private final boolean isCompleted;


    public ImmutableTask(String name, String description, boolean isCompleted) {
        this.name = name;
        this.description = description;
        this.isCompleted = isCompleted;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}