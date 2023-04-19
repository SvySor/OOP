package org.example.sem3;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;
    List<Answer> answerList;


    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.answerList = new ArrayList<>();
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        word = generateWorld();//слово загаданное пк
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputValue(String value) {
        attempts--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
        }
        if (bulls == word.length()) {
            gameStatus = GameStatus.WIN;
        }
        else {
              if (attempts == 0) {
                    gameStatus = GameStatus.LOSE;
                }
            }
        Answer currentAnswer = new Answer(value, cows, bulls);
        answerList.add(currentAnswer);
        return currentAnswer;
    }


    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    private String generateWorld() {
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWorld = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWorld = resWorld.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        System.out.println(resWorld);
        return resWorld;
    }

    abstract List<String> generateCharList();
}
