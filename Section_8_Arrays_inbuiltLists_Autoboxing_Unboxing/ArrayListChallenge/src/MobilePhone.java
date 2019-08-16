import java.util.ArrayList;
// An ArrayList is an ordered collection of elements that can contain duplicates.
// This contact list project uses some of the methods available to ArrayLists
// in order to append new contacts to the end of the list, remove certain contacts,
// and retrieve contacts by index. 

public class MobilePhone {

    private ArrayList<Contacts> ContactList = new ArrayList<Contacts>();

    // Add contact to list
    public void addContact(Contacts contact) {
        if (findPosition(contact.getName()) < 0) {
            ContactList.add(contact);
        } else {
            System.out.println("Contact for " + contact.getName() + " already exists.");
        }
    }

    // Get contact list
    public ArrayList getContactList() {
        return ContactList;
    }

    // Remove contact from list
    public void removeContact(String name) {
        if (findPosition(name) >= 0) {
            ContactList.remove(findPosition(name));
            System.out.println("Contact for " + name + " removed.");
        } else {
            System.out.println("Contact does not exist");
        }
    }

    // Find a contact
    public void findContact(String name) {
        if (findPosition(name) >= 0) {
            System.out.println("Contact found: " + ContactList.get(findPosition(name)));
        } else {
            System.out.println("Contact not found");
        }
    }

    // Modify a contact
    public void changeContact(String name, int phoneNumber) {
        if (findPosition(name) >= 0) {
            int position = findPosition(name);
            ContactList.set(position, new Contacts(phoneNumber, name));
        } else {
            System.out.println("Contact does not exist");
        }
    }

    // Print contact list
    public void printContactList() {
        for(int i=0; i< ContactList.size(); i++) {
            System.out.println((i+1) + ". " + ContactList.get(i).getName() + " : " + ContactList.get(i).getPhoneNumber());
        }
    }


    // Find contact position
    public int findPosition(String name) {
        int position = -1;

        for (int i = 0; i < ContactList.size(); i++) {
            if (ContactList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                position = i;
                break;
            }
        }
        return position;
    }
}
