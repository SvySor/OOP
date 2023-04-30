package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        try {
            Scanner sc = new Scanner(new File("addressdata.txt"));
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String newLine = "Кузнецов 98885532211";
        try {
            FileWriter fw = new FileWriter(new File("addressdata.txt"), true);
            fw.write("\n");
            fw.write(newLine);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Scanner sc = new Scanner(new File("addressdata.txt"))){
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}