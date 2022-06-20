package Contacts;

import java.util.Scanner;

public class Contact {
    private Scanner scanner;
    private String firstName;
    private String lastName;
    private String phoneNumber;

public Contact(String firstName, String lastName, String phoneNumber)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }

    public void setFirstName(String input){
        this.firstName = input;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String input){
        this.lastName = input;
    }
    public String getLastName(){
        return lastName;
    }


    }

