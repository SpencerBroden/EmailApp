package emailapp;

import java.util.Scanner;

public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternativeEmail;
    
    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	System.out.println("Email Created: " + this.firstName + " " + this.lastName);
	
	// Call a method asking for the department - return the department
	this.department = setDepartment();
	System.out.println("Department: " + this.department);
    }
    // Ask for the department
    private String setDepartment() {
	System.out.println("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting \n0 for None");
	System.out.print("Enter Department: ");
	Scanner in = new Scanner(System.in);
	int deptChoice = in.nextInt();
	in.close();
	switch(deptChoice) {
	case 1: return "sales";
	case 2: return "dev";
	case 3: return "acct";
	case 0: return "";
	default: return "";
	}
    }
    // Generate a random password

    // Set the mailbox capacity
    
    // Set the alternate email
    
    // Change the password
    
}
