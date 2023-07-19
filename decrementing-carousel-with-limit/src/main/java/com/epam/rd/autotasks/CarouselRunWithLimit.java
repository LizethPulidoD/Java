package com.epam.rd.autotasks;

public class CarouselRunWithLimit extends CarouselRun {

    private int runLimit;
    private int runCounter = 0;

    public CarouselRunWithLimit(int[] elements, int runLimit) {
        super(elements);
        this.runLimit = runLimit;
    }

    @Override
    public int next() {
        if (!isFinished()) {
            if (decrementPosition == elements.length) {
                this.decrementPosition = 0;
            }
            if (this.elements[decrementPosition] > 0) {
                runCounter++;
                return elements[decrementPosition++]--;
            } else {
                this.decrementPosition++;
                return next();
            }
        } else {
            return -1;
        }
    }

    @Override
    public boolean isFinished() {

        boolean isFinish = true;
        for (int element : elements) {
            if (element > 0) {
                isFinish = false;
            }
        }
        return isFinish || runCounter == runLimit;
    }
}
