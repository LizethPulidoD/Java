package com.epam.rd.autotasks;

public class TaskCarousel {
    int capacity;
    Task[] task;
    private boolean isFull = isFull();

    public TaskCarousel(int capacity) {
        this.capacity = capacity;
    }

    public boolean addTask(Task task) {
        if (task != null && !task.isFinished() && !isFull) {
            return true;
        } else {
            return false;
        }
    }

    public boolean execute() {

    }

    public boolean isFull() {
        if (task.length == capacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (this.task == null) {
            return true;
        } else {
            return false;
        }
    }

}
