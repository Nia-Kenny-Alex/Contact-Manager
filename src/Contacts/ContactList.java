package Contacts;

public class ContactList {

    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<Contact>();


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter First Name : ");
        String firstName = input.nextLine();

        System.out.println("Please enter Last Name : ");
        String lastName = input.nextLine();

        System.out.println("Please enter Phone Number : ");
        String phoneNumber = input.nextLine();

    }

}
