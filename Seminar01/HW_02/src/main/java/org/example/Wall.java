package org.example;

public class Wall extends Barrier {
    int maxHigh;

    public Wall(int maxHigh) {
        this.maxHigh = maxHigh;
    }

    public int getMaxHigh() {
        return maxHigh;
    }

    public void setMaxHigh(int maxHigh) {
        this.maxHigh = maxHigh;
    }

    @Override
    public boolean pass(JumpAndRun participant) {
        return participant.jump(maxHigh);
    }
}
