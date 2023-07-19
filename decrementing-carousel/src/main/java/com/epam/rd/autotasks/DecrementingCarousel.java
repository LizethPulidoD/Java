package com.epam.rd.autotasks;

public class DecrementingCarousel {
    private final int CAPACITY;
    private int elements[];
    private boolean isRunning;
    private int elementIndex = 0;

    public DecrementingCarousel(int capacity) {
        this.CAPACITY = capacity;
        this.elements = new int[capacity];
    }

    public boolean addElement(int element) {
        if (element > 0 && !isRunning && elementIndex < this.CAPACITY) {
            elements[elementIndex++] = element;
            return true;
        } else {
            return false;
        }
    }

    public CarouselRun run() {
        if (!isRunning) {
            isRunning = true;
            return new CarouselRun(this.elements);
        } else {
            return null;
        }

    }
}
