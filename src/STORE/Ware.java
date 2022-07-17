package STORE;

public class Ware {
    
    public String name;
    public int price;
    public String productionDate;
    public String expiryDate;
    
    // constructor for set fields
    public Ware
        ( String name, int price, int monthP, int yearP, int monthE, int yearE){
            this.name = name;
            this.price = price;
            productionDate = String.format( "%d\\%d", yearP, monthP );
            expiryDate = String.format( "%d\\%d", yearE, monthE );
    }
    
    // edite ware name
    public void setName(String name){
        this.name = name;
    }
    
    // edite ware price
    public void setPrice(int price){
        this.price = price;
    }
    
    // edite production & expiry date of a ware
    public void setDate(int monthP, int yearP, int monthE, int yearE){
        productionDate = String.format( "%d\\%d", yearP, monthP );
        expiryDate = String.format( "%d\\%d", yearE, monthE );
    }
    
    // return information of wares
    public String get() {
        String s = String.format("Name: %s\n"
                + "Price: %s T\n"
                + "Production Date: %s\n"
                + "Expiry Date: %s",
                name, price, productionDate, expiryDate);
        return s;
    }
    
    //return name's ware
    public String getName(){
        return name;
    }
    
    // return price's ware
    public int getPrice(){
        return price;
    }
    
    // return production & expiry date of a ware
    public String getDate(){
        String s = String.format("productionDate: %s\n"
                + "expiryDate: %s\n",
                productionDate, expiryDate);
        return s;
        }
    
    // print ware's information
    public void printWareInforamation() {
        String s = String.format( "Name: %s\n"
                + "Price: %s\n"
                + "ProductionDate: %s\n"
                + "ExpiryDate: %s\n\n",
                name, price, productionDate, expiryDate);
        System.out.printf("%s\n", s);
    }
} // end class Ware 