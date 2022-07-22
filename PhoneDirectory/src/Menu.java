class Menu {

    static void displayMenu() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                      1. Phone directory main menu                  |");
        System.out.println("| Choose an option followed by the ENTER key                         |");
        System.out.println("| 1. Main menu                                                       |");
        System.out.println("| 2. Display all contacts                                            |");
        System.out.println("| 3. Add a contact                                                   |");
        System.out.println("| 4. Update a contact                                                |");
        System.out.println("| 5. Delete a contact                                                |");
        System.out.println("| 6. Search contacts                                                 |");
        System.out.println("| 7. Quit                                                            |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print("> ");
    }

    static void displayContacts() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                    2. Display all contacts                         |");
        System.out.println("+--------------------------------------------------------------------+");
    }

    static void addContact() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                         3. Add a contact                           |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print("Enter contact's name: ");
    }

    static void updateContact() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                        4. Update a contact                         |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print("Enter name of contact you want to update:                               ");
    }

    static void deleteContact() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                        5. Delete a contact                         |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print("Enter name of contact you would like to delete:                         ");
    }

    static void searchContacts() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                       6. Search contacts                           |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print("Search for contact:                                                     ");
    }

    static void quit() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                           7. End                                   |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print("Thanks!)");
    }

    static void chooseOption() {
        System.out.print("Please choose an option");
    }
}