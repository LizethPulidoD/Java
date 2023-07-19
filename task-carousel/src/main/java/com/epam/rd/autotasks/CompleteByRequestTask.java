package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    private boolean isComplete;
    @Override
    public void execute() {
            this.setComplete(true);
    }

    @Override
    public boolean isFinished() {
        return this.isComplete;
    }

    public void setComplete(boolean complete) {
        this.isComplete = complete;
    }
}
