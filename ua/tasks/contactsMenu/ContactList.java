package ua.tasks.contactsMenu;

import java.util.Scanner;

public class ContactList {

    Contact[] list = new Contact[10];
    int size = 0;

    public void addContact(Contact contact) {
        list[size] = contact;
        size++;
        if(list[size - 1] == null){
            size = size - 1;
        }
    }

    public String asString() {
        String result = "";
        for (int i = 0; i < size; i++) {

            result = result + list[i].conclusion() + "\n";

        }
        return result;
    }

    public void createContact(ContactList contactList) {
        Contact contact = new Contact();
        contact.initContact(contact);
        contactList.addContact(contact);
    }

    public String showLifeContacts() {
        String result = "";
        for (int i = 0; i < size; i++) {

            Contact contactLife = list[i];
            if (contactLife.phone.substring(0, 3).equals("063")) {
                result = result + list[i].conclusion() + "\n";
            }

        }
        return result;
    }

    public String showMTSContacts() {
        String result = "";
        for (int i = 0; i < size; i++) {

            Contact contactLife = list[i];
            if (contactLife.phone.substring(0, 3).equals("050")) {
                result = result + list[i].conclusion() + "\n";
            }

        }
        return result;
    }

    public String showFirstFive() {
        String result = "";
        for (int i = 0; i < size && i < 6; i++) {

            result = result + list[i].conclusion() + "\n";

        }
        return result;
    }

    public String showLastFive() {
        String result = "";
        if (size > 5) {
            for (int i = 0; i < size && i > 5; i++) {

                result = result + list[i].conclusion() + "\n";

            }
        } else {
            result = "Contacts less than five" + "\n";
        }
        return result;
    }

    public String findContact() {
        Scanner str = new Scanner(System.in);
        String result = "";
        System.out.print("Enter the name: ");
        String nameContact = str.next();
        for (int i = 0; i < size; i++) {

            Contact contactFind = list[i];
            if (contactFind.name.toLowerCase().equals(nameContact.toLowerCase())) {
                result = result + list[i].conclusion() + "\n";
            }
        }
        if (result == "") {
            result = "Contact not found" + "\n";
        }
        return result;
    }

    public void removeContact() {
        Scanner str = new Scanner(System.in);
        String result = "";
        System.out.print("Enter the name: ");
        String nameContact = str.next();
        for (int i = 0; i < size; i++) {
            Contact contactFind = list[i];
            if (contactFind.name.toLowerCase().equals(nameContact.toLowerCase())) {
                list[i] = null;
            }
            list[i] = list[i + 1];
            size --;
        }
    }
}

