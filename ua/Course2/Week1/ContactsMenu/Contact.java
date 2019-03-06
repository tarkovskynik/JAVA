package ua.Course2.Week1.ContactsMenu;

import java.util.Scanner;

public class Contact {
    String name;
    String phone;


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact initContact(Contact contact) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the name: ");
        setName(str.next());
        System.out.print("Enter the phone: ");
        setPhone(str.next());
        contact.setName(name);
        contact.setPhone(phone);
        return contact;
    }

    public String conclusion() {

        return "Name = " + name + ";" + " " + "Phone = " + phone + ";";

    }
}



 /*   public Contact() {
    }

    public void initContact(){
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the name: ");
        this.name = str.next();
        System.out.print("Enter the phone: ");
        this.phone = str.next();
    }

    public Contact(String n , String p){
        name = n;
        phone = p;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    */