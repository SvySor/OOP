package org.example;

public class Main {
    public static void main(String[] args) {
        JumpAndRun[] participants = {
                new Human(2, 42),
                new Human(1, 15),
                new Cat(1, 1),
                new Cat(3, 5),
                new Robot(0, 500),
                new Robot(100, 1000),
        };
        Barrier[] barriers = {
                new Route(5),
                new Wall(1),
                new Route(21),
                new Wall(2),
                new Route(50),
        };
        for (int i = 0; i < participants.length; i++) {
            System.out.println("Участник " + i + " тип " + participants[i].getClass().getName() +
                    " приступил к преодолению полосы препятствий");
            boolean fullResult = true;
            for (int j = 0; j < barriers.length; j++) {
                System.out.println("Участник приступил к преодолению " + barriers[j].getClass().getName() + " " +j);
                boolean result = barriers[j].pass(participants[i]);
                if (!result) {
                    System.out.println("Участник " + participants[i].getClass().getName() + " № " + i + " выбыл с соревнований");
                    System.out.println();
                    fullResult = false;
                    break;
                }
            }
            if (fullResult) {
                System.out.println("Участник " + participants[i].getClass().getName() + " с номером " + i + " успешно прошёл полосу препятствий.");
                System.out.println();
            }
        }
    }
}