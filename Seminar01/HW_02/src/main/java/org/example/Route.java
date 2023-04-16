package org.example;

public class Route extends Barrier {
    int maxLength;

    public Route(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean pass(JumpAndRun participant) {
        return participant.run(maxLength);
    }
}
