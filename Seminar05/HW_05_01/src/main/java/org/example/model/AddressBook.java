package org.example.model;

import java.io.File;
import java.io.FileNotFoundException;
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

    public List<String> findRecord(String search) {
        List<String> book = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filePath))) {
            while (sc.hasNextLine()) {
                String tmpLine = sc.nextLine();
                if (tmpLine.contains(search)) {
                    book.add(tmpLine);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return book;
    }

    public boolean addRecord(String addString) {
        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(addString + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeRecord(List<String> removeList) {
        StringBuilder newBook = new StringBuilder();
        try (Scanner sc = new Scanner(new File(filePath));
             FileWriter fw = new FileWriter(filePath, false)){
            while (sc.hasNextLine()) {
                String tmpLine = sc.nextLine();
                if (!removeList.contains(tmpLine)) {
                    newBook.append(tmpLine).append("\n");
                } else {
                    removeList.remove(tmpLine);
                }
            }
            fw.write(newBook.toString());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
