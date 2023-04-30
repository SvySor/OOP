package org.example.view;

import org.example.Commands;

import java.util.Scanner;

public class Menu {
    private Scanner sc;

    public Menu() {
        this.sc = new Scanner(System.in);
    }

    public Commands commandChoiceProcess(){
        System.out.println("Добрый день");
        int commandNumber = Integer.parseInt(sc.nextLine());
        return Commands.findCommand(commandNumber);
    }

    public void


}
