package org.example;

import org.example.controller.AddressBookController;
import org.example.model.AddressBook;
import org.example.view.Menu;

public class Main {
    public static void main(String[] args) {
        AddressBookController addressBookController = new AddressBookController(new AddressBook("addressdata.txt"), new Menu());
        addressBookController.runBook();
    }
}