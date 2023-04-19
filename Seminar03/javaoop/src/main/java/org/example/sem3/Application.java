package org.example.sem3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean ifGameAgain;
        do {
            ifGameAgain = false;
            System.out.println("1 - цифра, 2 - латиница, 3 - кириллица");
            Scanner scanner = new Scanner(System.in);
            System.out.print("выберите игру: ");
            int num = Integer.parseInt(scanner.nextLine());
            Game game = null;
            switch (num) {
                case 1:
                    game = new NumberGame();
                    game.start(4, 10);
                    break;
                case 2:
                    game = new EnGame();
                    game.start(2, 10);
                    break;
                case 3:
                    game = new RuGame();
                    game.start(2, 10);
                    break;
                default:
                    System.out.println("данная игра еще не добавлена!");
            }
            while (game.getGameStatus().equals(GameStatus.START)) {
                System.out.print("ход: ");
                String answer = scanner.nextLine();
                Answer answerGame = game.inputValue(answer);
                System.out.println("коров - " + answerGame.getCow() + " , быков - " + answerGame.getBull());
                System.out.printf("У вас осталось %d попыток\n", ((AbstractGame) game).getAttempts());
            }
            if (game.getGameStatus() == GameStatus.WIN) {
                System.out.println("Вы победили");
            } else {
                System.out.println(("Вы проиграли"));
            }
            System.out.println("Вывести историю ходов? (Y/N)");
            String answ = scanner.nextLine();
            if (answ.equals("Y")) {
                System.out.println(((AbstractGame) game).getAnswerList());
            }
            System.out.println("Хотите сыграть ещё раз?? (Y/N)");
            if (scanner.nextLine().equals("Y")) {
                ifGameAgain = true;
            };
        } while (ifGameAgain);
    }
}
