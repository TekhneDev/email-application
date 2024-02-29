package model; //Na aula o package é emailapp

import java.util.Scanner;

public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "tekhnedevcompany.com";

    // Constructor to recive the first name and last name
    public Email( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a method for the department - return the departament
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);

    }



    // Ask for the department
    private String setDepartment() {
        System.out.print("Department Codes:\n 1 for Sale\n 2 for Development\n 3 for Accounting\n 0 for none\n Enter your department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        // Loop could been done here
        if (depChoice == 1) { return "sales"; }
        else if (depChoice == 2) { return "dev"; }
        else if (depChoice == 3) { return "acct"; }
        // else if (depChoice == 0) { return "back to menu"; }
        // else { return "error, please select a valid number"; }
        else { return ""; }
    }
    


    // Generate a radom password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#%$&";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // Set mailbox capacity


    // Set the alternate email


    // Change pasword



}
