import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Main {

    static final Scanner keyboard = new Scanner(System.in);
    static final PhoneDirectory phoneDirectory = new PhoneDirectory();

    public static void main(String[] args) throws IOException, ParseException, InterruptedException {

        JSONParser parser = new JSONParser();
        File contactsFile = new File("./contacts/contacts.json");

        JSONArray json = (JSONArray) parser.parse(new FileReader(contactsFile));
        for (Object o : json) {
            JSONObject contact = (JSONObject) o;
            String name = (String) contact.get("name");
            String phone = (String) contact.get("phone");
            phoneDirectory.addContact(name, phone);
        }
        System.out.println("\nContacts from " + contactsFile.getName() + " have been added to the phone directory.\n");

        boolean quit = false;
        int selection;

        Menu.displayMenu();

        while (!quit) {
            selection = keyboard.nextInt();
            keyboard.nextLine();
            switch (selection) {
                case 1 -> Menu.displayMenu();
                case 2 -> {
                    Menu.displayContacts();
                    phoneDirectory.displayContacts();
                    Menu.chooseOption();
                }
                case 3 -> addContact();
                case 4 -> updateContact();
                case 5 -> deleteContact();
                case 6 -> searchContacts();
                case 7 -> {
                    quit = true;
                    Menu.quit();
                }
                default -> System.out.println("Please enter a selection.");
            }
        }
    }

    static void addContact() {
        Menu.addContact();
        String contactName = keyboard.nextLine();
        System.out.print("Enter contact's phone number: ");
        String contactPhone = keyboard.nextLine();
        phoneDirectory.addContact(contactName, contactPhone);
        Menu.chooseOption();
    }

    static void updateContact() {
        Menu.updateContact();
        String existingContactName = keyboard.nextLine();

        if (phoneDirectory.findContact(existingContactName)) {
            System.out.print("Enter a new name for " + existingContactName + ": ");
            String newName = keyboard.nextLine();
            System.out.print("Enter a new phone number for " + newName + ": ");
            String newPhone = keyboard.nextLine();
            phoneDirectory.updateContact(existingContactName, newName, newPhone);
        } else {
            System.out.println(existingContactName + " is not listed in the phone directory.");
        }
        Menu.chooseOption();
    }

    static void deleteContact() {
        Menu.deleteContact();
        String existingContactName = keyboard.nextLine();
        if (phoneDirectory.findContact(existingContactName)) {
            phoneDirectory.deleteContact(existingContactName);
        } else {
            System.out.println(existingContactName + " is not listed in the phone directory.");
        }
        Menu.chooseOption();
    }

    static void searchContacts() {
        Menu.searchContacts();
        String existingContactName = keyboard.nextLine();
        if (phoneDirectory.findContact(existingContactName)) {
            String phoneNumber = phoneDirectory.searchContact(existingContactName);
            System.out.println(existingContactName + "'s phone number is " + phoneNumber + " in the phone directory.");
        } else {
            System.out.println(existingContactName + " is not listed in the phone directory.");
        }
        Menu.chooseOption();
    }
}