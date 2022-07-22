import java.util.HashMap;
import java.util.TreeMap;

class PhoneDirectory {

    final TreeMap<String, String> phoneDirectory = new TreeMap<>();

    void displayContacts() {
        if (phoneDirectory.isEmpty()) {
            System.out.println("The phone directory is empty.");
        } else {
            int count = 1;
            System.out.println("The phone directory has these contact details: ");
            for (HashMap.Entry<String, String> entry : phoneDirectory.entrySet()) {
                System.out.println(count + ")\t\t" + "Name : " + entry.getKey() + "\t\t" +
                        "Phone number: " + entry.getValue());
                count++;
            }
        }
    }

    void addContact(String contactName, String contactPhone) {
        if (phoneDirectory.containsKey(contactName)) {
            System.out.println(contactName + "'s details are already in the phone directory.");
        } else {
            phoneDirectory.put(contactName, contactPhone);
            System.out.println(contactName + "'s details have been added to the phone directory.");
        }
    }

    void updateContact(String oldContact, String newName, String newPhone) {
        if (phoneDirectory.containsKey(oldContact)) {
            phoneDirectory.remove(oldContact);
            phoneDirectory.put(newName, newPhone);
            System.out.println(newName + "'s details were updated in the phone directory.");
        } else {
            System.out.println(oldContact + " is not in the phone directory.");
        }
    }

    void deleteContact(String existingContactName) {
        phoneDirectory.remove(existingContactName);
        System.out.println(existingContactName + "'s details were deleted from the phone directory.");
    }

    String searchContact(String searchContact) {
        return phoneDirectory.get(searchContact);
    }

    boolean findContact(String name) {
        return phoneDirectory.containsKey(name);
    }
}