package com.epam.rd.autotasks;

public class GraduallyDecreasingCarouselRun extends CarouselRun {
    int decrementingFactor = 1;

    public GraduallyDecreasingCarouselRun(int[] elements) {
        super(elements);
    }

    public int next() {
        if (!isFinished()) {
            if (decrementPosition == elements.length) {
                this.decrementPosition = 0;
                decrementingFactor++;
            }
            if (this.elements[decrementPosition] > 0) {
                int currentValue=elements[decrementPosition];
                elements[decrementPosition++] -= decrementingFactor;
                return currentValue;
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
        boolean isFinish=true;
        for (int element : elements) {
            if (element>0) {
                isFinish=false;
            }
        }
        return isFinish;
    }
}