package com.epam.rd.autotasks;

public class CarouselRun {
    int decrementPosition = 0;
    final int[] elements;

    public CarouselRun(int[] elements) {
        this.elements = elements;
    }

    public int next() {
        if (!isFinished()) {
            if (decrementPosition == elements.length) {
                this.decrementPosition = 0;
            }
            if (this.elements[decrementPosition] > 0) {
                return elements[decrementPosition++]--;
            } else {
                this.decrementPosition++;
                return next();
            }
        } else {
            return -1;
        }
    }

    public boolean isFinished() {
        int accumulator = 0;
        for (int element : elements) {
            accumulator += element;
        }
        return accumulator == 0;
    }
}
