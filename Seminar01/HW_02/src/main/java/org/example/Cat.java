package org.example;

public class Cat implements JumpAndRun {
    private int maxHigh;
    private int maxLength;

    public Cat(int maxHigh, int maxLength) {
        this.maxHigh = maxHigh;
        this.maxLength = maxLength;
    }

    public int getMaxHigh() {
        return maxHigh;
    }

    public void setMaxHigh(int maxHigh) {
        this.maxHigh = maxHigh;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean jump(int wallHigh) {
        if (wallHigh < maxHigh) {
            System.out.println("Кот стену перепрыгнул");
            return true;
        } else {
            System.out.println("Неудача");
            return false;
        }
    }

    @Override
    public boolean run(int routeLength) {
        if (routeLength < maxLength) {
            System.out.println("Кот дорожку пробежал");
            return true;
        } else {
            System.out.println("Неудача");
            return false;
        }
    }
}
