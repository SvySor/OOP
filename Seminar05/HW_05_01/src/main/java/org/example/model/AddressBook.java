package org.example.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private String filePath;
    public AddressBook(String filePath) {
        this.filePath = filePath;
    }

    public List<String> findRecord(String search){
        Scanner sc = new Scanner(filePath);
        List<String> book = new ArrayList<>();
        while (sc.hasNextLine()){
            String tmpLine = sc.nextLine();
            if (tmpLine.contains(search)){
                book.add(tmpLine);
            }
        }
        sc.close();
        return book;
    }

    public void addRecord(String addString){
        try(FileWriter fw = new FileWriter(filePath, true)){
            fw.write(addString + "\n");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void removeRecord(List<String> removeList){
        StringBuilder newBook = new StringBuilder();
        Scanner sc = new Scanner(filePath);
        while (sc.hasNextLine()){
            String tmpLine = sc.nextLine();
            if (! removeList.contains(tmpLine)){
                newBook.append(tmpLine).append("\n");
            } else {
                removeList.remove(tmpLine);
            }
        }
        try(FileWriter fw = new FileWriter(filePath, false)){
            fw.write(newBook.toString());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
