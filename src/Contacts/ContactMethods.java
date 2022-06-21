package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactMethods {
    public static Path projectFile = Paths.get("src","contact.txt");
    public static void showMenu() {
        //Control Menu

        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");
    }
    public static void addContact () {

        List<Contact> contacts = new ArrayList<Contact>();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Name : ");
        String Name = input.nextLine();
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
    }
}


//defines all our methods-- codes we defined in our main method
//use a method called showMenu to actually display the menu