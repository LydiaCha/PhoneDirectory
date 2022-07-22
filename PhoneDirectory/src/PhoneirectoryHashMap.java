import java.util.HashMap;

class PhoneDirectoryHashMap {

    final HashMap<String, String> phoneDirectoryHashMap = new HashMap<>();

    void displayContacts() {
        if (phoneDirectoryHashMap.isEmpty()) {
            System.out.println("The hashmap is empty.");
        } else {
            int count = 1;
            System.out.println("The hashmap contains these contact details: ");
            for (HashMap.Entry<String, String> entry : phoneDirectoryHashMap.entrySet()) {
                System.out.println(count + ")\t\t" + "Name : " + entry.getKey() + "\t\t" +
                        "Phone number: " + entry.getValue());
                count++;
            }
        }
    }

    void addContact(String contactName, String contactPhone) {
        if (phoneDirectoryHashMap.containsKey(contactName)) {
            System.out.println(contactName + "'s details are already in the hashmap.");
        } else {
            phoneDirectoryHashMap.put(contactName, contactPhone);
            System.out.println(contactName + "'s details have been added to the hashmap.");
        }
    }

    void updateContact(String oldContact, String newName, String newPhone) {
        if (phoneDirectoryHashMap.containsKey(oldContact)) {
            phoneDirectoryHashMap.remove(oldContact);
            phoneDirectoryHashMap.put(newName, newPhone);
            System.out.println(newName + "'s details were updated in the hashmap.");
        } else {
            System.out.println(oldContact + " is not listed in the hashmap.");
        }
    }

    void deleteContact(String existingContactName) {
        phoneDirectoryHashMap.remove(existingContactName);
        System.out.println(existingContactName + "'s details were deleted from the hashmap.");
    }

    String searchContact(String searchContact) {
        return phoneDirectoryHashMap.get(searchContact);
    }

    boolean findContact(String name) {
        return phoneDirectoryHashMap.containsKey(name);
    }
}