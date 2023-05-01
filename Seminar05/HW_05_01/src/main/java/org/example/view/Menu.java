package org.example.view;

import org.example.Commands;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner sc;

    public Menu() {
        this.sc = new Scanner(System.in);
    }

    public Commands commandChoiceProcess() {
        System.out.println("Добрый день. Вы вошли в телефонный справочник");
        System.out.println("Ввеите номер операции: \n" +
                "1 - Найти запись\n" +
                "2 - Добавить запись\n" +
                "3 - Удалить запись\n" +
                "0 - выйти из адресной книги\n");
        int commandNumber = Integer.parseInt(sc.nextLine());
        return Commands.findCommand(commandNumber);
    }

    public void printRecords(List<String> listToPrint) {
        for (int i = 0; i < listToPrint.size(); i++) {
            System.out.println(i +1 + " " + listToPrint.get(i));
        }
    }

    public List<String> createListToDelete(List<String> selectedRecords){
        printRecords(selectedRecords);
        System.out.println("Ввведите строки, которые нужно удалить через пробел. Например: 3 4 8 ");
        String stringToDelete = sc.nextLine();
        List<Integer> numbersToDelete = Arrays.stream(stringToDelete.split(" ")).map(Integer::parseInt).toList();
        List<String> listToDelete = new ArrayList<>();
        for (int i = 0; i < numbersToDelete.size(); i++) {
            listToDelete.add(selectedRecords.get(numbersToDelete.get(i)-1));
        }
        return listToDelete;
    }

    public String enterRecordToAdd(){
        System.out.println("Введите новую запись в формате 'ФИО 88888888888 (номер телефона");
        return sc.nextLine();
    }

    public String enterMaskToSearch(){
        System.out.println("Введите маску поиска: ");
        return sc.nextLine();
    }

    public void operationResult(boolean resultOfOperation){
        if (resultOfOperation){
            System.out.println("Операция прошла успешно");
        } else {
            System.out.println("Ошибка в операции");
        }
    }
}
