/*                  >>>>>   In the name of Allah   <<<<<                      
* Master Name : Ali Rezaei
* Student Name: Mostafa Khawari
*/
package STORE;

/*
* It's main class and relation with other class
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // user input(keyboard)
        // get input 
        System.out.println("                      << In The Name Of GOD >>\n");
        System.out.println("                       Welcome To This Store\n");
        System.out.println(">> Please Complete Needful Information:\n");

        System.out.print("* Enter Name's Store: ");
        String storeName = input.nextLine();

        System.out.print("* Enter Address's Store: ");
        String storeAddress = input.nextLine();

        System.out.print("* Enter First Name's Owner: ");
        String firstName = input.next();

        System.out.print("* Enter Last Name's Owner: ");
        String lastName = input.next();

        System.out.print("* Enter ID's Owner: ");
        long ID = input.nextLong();

        // pass input to constructors
        Store myStore = new Store(storeName, storeAddress, firstName, lastName, ID);

        // set birthday 
        System.out.print("* Enter birthday >> Day: ");
        int day = input.nextInt();
        System.out.print("                    Month: ");
        int month = input.nextInt();
        System.out.print("                    Year: ");
        int year = input.nextInt();
        
        // set variable of birthday
        myStore.setDateBirthday(day, month, year);

        // a loop for show Menu
        boolean runLoop = true;
        do {
            printMenu();
            // get user's selection
            int select = input.nextInt();
            System.out.println();
            switch (select) {
                
                // Show Information's Store
                case 1:
                    myStore.printStoreInformation();
                    break;
                    
                // Change Name's Store
                case 2:
                    System.out.print("Enter New Name For Store: ");
                    storeName = input.next();
                    myStore.setStoreName(storeName);
                    break;
                    
                // Change Address's Store
                case 3:
                    System.out.print("Enter New Address For Store: ");
                    storeAddress = input.next();
                    myStore.setStoreAddress(storeAddress);
                    break;
                    
                //  Edite Particulars of Store Owner
                case 4:
                    System.out.print("Enter New First Name: ");
                    firstName = input.next();
                    System.out.print("Enter New Last Name: ");
                    lastName = input.next();
                    System.out.print("Enter New ID: ");
                    ID = input.nextLong();
                    System.out.print("* Enter Birthday >> Day: ");
                    day = input.nextInt();
                    System.out.print("                    Month: ");
                    month = input.nextInt();
                    System.out.print("                    Year: ");
                    year = input.nextInt();
                    
                    // set information's owner 
                    myStore.setOwnerInformation(firstName, lastName, ID);
                    myStore.setDateBirthday(day, month, year);
                    break;
                    
                // Add A Ware
                case 5:
                    System.out.print("Enter Name's: ");
                    String wareName = input.next();
                    System.out.print("Enter Price's: ");
                    int price = input.nextInt();
                    System.out.print("Enter Prodution Month: ");
                    int monthP = input.nextInt();
                    System.out.print("Enter Production Year: ");
                    int yearP = input.nextInt();
                    System.out.print("Enter Expiry Month: ");
                    int monthE = input.nextInt();
                    System.out.print("Enter Expiry Year: ");
                    int yearE = input.nextInt();

                    // pass information's
                    myStore.addNewWare(wareName, price, monthP, yearP, monthE, yearE);
                    break;
                    
                // Search A Ware
                case 6:
                    // call it's method
                    myStore.searchWare();
                    break;
                    
                // Exit
                case 7:
                    System.out.println("                  *************");
                    System.out.println("                  * Good Bye! *");
                    System.out.println("                  *************");
                    runLoop = false;
                    break;
            }
        } while (runLoop); // end Do-While Loop
    } // end main

    // Menu print method
    public static void printMenu() {
        System.out.println();
        System.out.println(" ________________________________________");
        System.out.println("| 1) Show Information's Store            |");
        System.out.println("| 2) Change Name's Store                 |");
        System.out.println("| 3) Change Address's Store              |");
        System.out.println("| 4) Edite Particulars of Store Owner    |");   
        System.out.println("| 5) Add A Ware                          |");
        System.out.println("| 6) Search A Ware                       |");
        System.out.println("| 7) Exit                                |");
        System.out.println(" ________________________________________");
        System.out.print(">>> Please enter a number between (1) & (7): ");
    } // end methode's printMenu
} // end class Main