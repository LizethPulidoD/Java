package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel {
    private int actionLimit;

    public DecrementingCarouselWithLimitedRun(final int capacity, int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }

    @Override
    public CarouselRun run() {
        if (!isRunning) {
            isRunning = true;
            return new CarouselRunWithLimit(this.elements, this.actionLimit);
        } else {
            return null;
        }
    }
}
