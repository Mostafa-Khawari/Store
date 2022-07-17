package STORE;

import java.util.Scanner;

public class Person {

    public String firstName;
    public String lastName;
    public long ID;
    public int day;
    public int month;
    public int year;
    Scanner input = new Scanner(System.in); // user input(keyboard)

    // constructor for information's owner
    public Person(String firstName, String lastName, long ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    // edite date of birthday
    public void setDateBirthday(int day, int month, int year) {
            
        // conditional for check  relation between day & month
        if (month >= 1 && month <= 6 && day >= 1 && day <= 31 && year < 1400) {
            this.day = day;
            this.month = month;
            this.year = year;
            
        } else if 
                (month >= 7 && month <= 12 && day >= 1 && day <= 30 && year < 1400) {
                this.day = day;
                this.month = month;
                this.year = year;
                
        } else {
            System.out.println();
            System.out.print("* :) Please Enter correct Date >> Day:  ");
            day = input.nextInt();
            System.out.print("                                  Month: ");
            month = input.nextInt();
            System.out.print("                                  Year: ");
            year = input.nextInt();
            setDateBirthday(day, month, year);
       }  
    } // end method setDateBirthday

    // edite first name's   
    public void setFistName(String name) {
        this.firstName = name;
    }

    // edite last name's
    public void setLastName(String name) {
        this.lastName = name;
    }

    // edite ID's
    public void setID(long ID) {
        this.ID = ID;
    }

    // return name's
    public String getName() {
        String str = String.format("%s %s", firstName, lastName);
        return str;
    }

    // return ID's
    public long getID() {
        return ID;
    }

    // return information's owner
    public String printOwnerInformation() {
        String s = String.format("Owner First Name: %s\n"
                + "Owner Last Name: %s\n"
                + "Owner ID: %s\n"
                + "Birthday: %d\\%d\\%d",
                firstName, lastName, ID, day, month, year);
        return s;
    }
} // end class Person