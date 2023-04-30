package org.example;

public enum Commands {
    FIND(1), ADD(2), REMOVE(3), EXIT(0);

    private int choice;

    Commands(int choice) {
        this.choice = choice;
    }

    public static Commands findCommand(int arg) {
        for (Commands command : Commands.values()) {
            if (command.choice == arg) {
                return command;
            }
        }
        throw new IllegalArgumentException("Недопустимый выбор");
    }
}
