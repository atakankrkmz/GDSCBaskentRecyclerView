package tech.otokon.gdscdemo.model;

public class Todo {
    public String task;
    public String description;
    public boolean done;

    public Todo(String task, String description, boolean done) {
        this.task = task;
        this.description = description;
        this.done = done;
    }
}
