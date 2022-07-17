package STORE;

/*
this class relation with class(Person & Ware)
here recieve information fron user by main class
and pass information to other class
for settting a store :). 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    private String storeName;
    private String address;
    public ArrayList<Ware> wares; //* a collection of wares in an arraylist
    public Person owner; //* an object of Person class
    Scanner input = new Scanner(System.in); // user input(keyboard)
    
    // constructor for set informations
    public Store(String storeName, String address, String firstName, String lastName, long ID) {
        this.storeName = storeName;
        this.address = address;
        
        // constructor of Person & pass variables
        owner = new Person(firstName, lastName, ID);
        
        // make an arrayList by value of zero
        wares = new ArrayList<>(0);
    } // end constructor

    // return name's store
    public String getStoreName() {
        return storeName;
    }

    // edite store name
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    // return address's store
    public String getStoreAddress() {
        return address;
    }

    // edite store address
    public void setStoreAddress(String address) {
        this.address = address;
    }
    
    // edite information of owner
    public void setOwnerInformation(String firstName, String lastName, long ID) {
        owner.setFistName(firstName);
        owner.setLastName(lastName);
        owner.setID(ID);
    }

    // set the date of Birthday
    public void setDateBirthday(int day, int month, int year) {
        owner.setDateBirthday(day, month, year);
    } 

    // return owner name
    public String getOwnerName() {
        return owner.firstName + " " + owner.lastName;
    } 

    // show store information
    public void printStoreInformation() {
        System.out.printf("**  Information Of Store  **\n"
                + "Name: %s\n"
                + "Address: %s\n"
                + "%s",
                storeName, address, owner.printOwnerInformation());
    }

    // add a new ware to store
    public void addNewWare(String name, int price, int monthP, int yearP, int monthE, int yearE) {
        // make new object from Ware Class and pass my variables of a new ware
        Ware myWare = new Ware(name, price, monthP, yearP, monthE, yearE);
        wares.add(myWare);
    }

    // find a ware in store
    public void searchWare() {
        System.out.print("Enter Name Of Ware: ");
        String search = input.next();
        int size = wares.size();
        boolean searching = false; // help to search
        int j = 0; // save palace of a ware in arraylist
        
        // a loop for search in arraylist
        for (int i=0; i<size && searching==false ; i++ ){
            if( wares.get(i).name.equalsIgnoreCase(search)) {
                searching = true;
                j = i;
                break;
            }
        } // end loop
        
        // print result
        if(! searching ) {
            System.out.println();
            System.out.println(" **  Not Found Dear :)  **");
        }
        else if( searching ){
            System.out.println(wares.get(j).get());
        }
    } // end method searchWare
} // end class Store