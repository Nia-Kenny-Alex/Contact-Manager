package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    public static Path projectFile = Paths.get("src","contact.txt");

    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<Contact>();


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Name : ");
        String Name = input.nextLine();
//
//use the below code as a "skeleton" to add something to a file
        System.out.println("Please enter Phone Number : ");
        String phoneNumber = input.nextLine();
        Contact c1 = new Contact(Name, phoneNumber);
        contacts.add(c1);

        List<String> dataTxt = new ArrayList<>();
        System.out.println(c1.getName() + " - " + c1.getPhoneNumber());

        dataTxt.add(c1.getName() + " - " + c1.getPhoneNumber());
        try{
            if (Files.exists(projectFile)) {
                Files.write(projectFile, dataTxt);
            }
        } catch (IOException iox){
            iox.printStackTrace();
        }

//        Path Files.write(Path filepath, List<String> lines[, StandardOpenOption option])
    }

    void displayContact(){
        System.out.println("Name:");
                System.out.println("Phone Number:");
    }

}
