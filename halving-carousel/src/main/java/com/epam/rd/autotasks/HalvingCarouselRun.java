package com.epam.rd.autotasks;

public class HalvingCarouselRun extends CarouselRun {
    public HalvingCarouselRun(int[] elements) {
        super(elements);
    }

    @Override
    public int next() {
        if (!isFinished()) {
            if (decrementPosition == elements.length) {
                this.decrementPosition = 0;
            }
            if (this.elements[decrementPosition] > 0) {
                int currentElement=elements[decrementPosition];
                elements[decrementPosition++]/=2;
                return currentElement;

            } else {
                this.decrementPosition++;
                return next();
            }
        } else {
            return -1;
        }
    }

}

