package ua.Course2.Week1.ContactsMenu;

import java.util.Scanner;

public class ContactListMenu {

    //  ContactListMenu contactList = new ContactListMenu();

    public void showMainMenu() {
        System.out.println("1. Add Contact");
        System.out.println("2. Show all contacts");
        System.out.println("3. Find Contact");
        System.out.println("4. Remove Contact");
        System.out.println("5. Show First Five Contacts");
        System.out.println("6. Show Last Five Contacts");
        System.out.println("7. Show Life Contacts");
        System.out.println("8. Show MTS Contacts");
        System.out.println("9. Exit");
    }

    public void statrProgram() {
        ContactList contactList = new ContactList();
        while (true) {
            showMainMenu();
            System.out.print("Enter the number: ");
            Scanner number = new Scanner(System.in);
            int choice = number.nextInt();
            switch (choice) {
                case 1:
                    contactList.createContact(contactList);
                    break;
                case 2:
                    System.out.print(contactList.asString());
                    break;
                case 3:
                    System.out.print(contactList.findContact());
                    break;
                case 4:
                    contactList.removeContact();
                    break;
                case 5:
                    System.out.print(contactList.showFirstFive());
                    break;
                case 6:
                    System.out.print(contactList.showLastFive());
                    break;
                case 7:
                    System.out.print(contactList.showLifeContacts());
                    break;
                case 8:
                    System.out.print(contactList.showMTSContacts());
            }
            if (choice == 9) {
                break;
            }
        }
    }
}


