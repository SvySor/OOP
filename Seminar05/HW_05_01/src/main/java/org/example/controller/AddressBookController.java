package org.example.controller;

import org.example.Commands;
import org.example.model.AddressBook;
import org.example.view.Menu;

import java.util.List;

public class AddressBookController {
    private AddressBook addressBook;
    private Menu menu;

    public AddressBookController(AddressBook addressBook, Menu menu) {
        this.addressBook = addressBook;
        this.menu = menu;
    }

    public AddressBook getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void runBook(){
        boolean toContinue = true;
        while (toContinue){
            Commands command = menu.commandChoiceProcess();
            switch (command){
                case ADD:
                    boolean result = addressBook.addRecord(menu.enterRecordToAdd());
                    menu.operationResult(result);
                    break;
                case FIND:
                    menu.printRecords(addressBook.findRecord(menu.enterMaskToSearch()));
                    break;
                case REMOVE:
                    String search = menu.enterMaskToSearch();
                    List<String> searchedList = addressBook.findRecord(search);
                    List<String> deletedList = menu.createListToDelete(searchedList);
                    result = addressBook.removeRecord(deletedList);
                    menu.operationResult(result);
                    break;
                case EXIT:
                    toContinue = false;
                    break;
            }
        }
    }
}
