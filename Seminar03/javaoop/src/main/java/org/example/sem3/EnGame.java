package org.example.sem3;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char counter = 'a'; counter <= 'z'; counter++) {
            charList.add(String.valueOf(counter));
        }
        return charList;

    }

//    public static void main(String[] args) {
//        System.out.println(new EnGame().generateCharList());
//    }
}
