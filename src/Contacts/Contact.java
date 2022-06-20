package Contacts;

import java.util.Scanner;

public class Contact {
    private Scanner scanner;
    private String Name;
    private String phoneNumber;

    public Contact(String Name, String phoneNumber) {
        this.Name = Name;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String input) {
        this.Name = input;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

