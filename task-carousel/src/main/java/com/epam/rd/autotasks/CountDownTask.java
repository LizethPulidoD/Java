package com.epam.rd.autotasks;

public class CountDownTask implements Task {
    int value;
    private boolean isFinish;

    public CountDownTask(int value) {
        if (value > 0) {
            this.value = value;
        } else {
            this.value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public void execute() {
        if (this.value == 0) {
            this.setFinish(true);
        }else {
            this.value--;
        }
    }

    @Override
    public boolean isFinished() {
        return this.isFinish;
    }

    public void setFinish(boolean finish) {
        this.isFinish = finish;
    }
}
