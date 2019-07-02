import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    changeExistingContact();
                    break;
                case 4:
                    removeExistingContact();
                    break;
                case 5:
                    searchExistingContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the current contact list.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify an existing contact.");
        System.out.println("\t 4 - To remove an existing contact.");
        System.out.println("\t 5 - To search for an existing contact.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addNewContact() {
        System.out.println("Enter the name of the new contact: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the phone number of the next contact: ");
        int newNumber = scanner.nextInt();
        Contacts contact = new Contacts(newNumber, newName);
        mobilePhone.addContact(contact);
    }

    public static void changeExistingContact() {
        System.out.println("Enter name of contact you would like to edit: ");
        String name = scanner.nextLine();
        System.out.println("Enter updated phone number for this contact: ");
        int phoneNumber = scanner.nextInt();
        mobilePhone.changeContact(name, phoneNumber);
    }

    public static void removeExistingContact() {
        System.out.println("Enter the name of the contact you would like to remove: ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    public static void searchExistingContact() {
        System.out.println("Enter name of contact to find: ");
        String name = scanner.nextLine();
        mobilePhone.findContact(name);
    }
}



