
public class OL_whatCar_Paulski
{
    //list of instance fields
    public OL_whatCar_Paulski[] carArray;
    public int carCount;
    public int carSize;
    private String color;
    private String make;
    private String model;
    private int year;
    private double mpg;
    private boolean available;
    private double stickerPrice;
    private double trade_in;
    private double discount;
    //Task 1: Create two OL constructors: one default: white Ford F-150, 2000, 25,000 
    //The other one with user input year, price, Make, model, color
    public OL_whatCar_Paulski(){
        color = "white";
        make = "Ford";
        model = "F-150";
        year = 2000;
        stickerPrice = 25000;
        mpg = 18;
    }

    public OL_whatCar_Paulski(int y, double s, String ma, String mo, String c, double p){
        year = y;
        stickerPrice = s;
        make = ma;
        model = mo;
        color = c;
        mpg = p;
    }

    public OL_whatCar_Paulski(int n){
        carSize = n;
        carCount = 0;
        carArray = new OL_whatCar_Paulski[carSize];
    }

    public void addCars(int y, double s, String ma, String mo, String c, double p){
        //Step 3: add one record at a time and keep track of index using studentCount
        carArray[carCount] = new OL_whatCar_Paulski(y,s,ma,mo,c,p);
        carCount++;
    }

    //Task 2: Create 3 getPrice() OL methods
    //Method 1 -->This getPrice without input parameter will return original price from the sticker
    public double getPrice(){
        return stickerPrice;
    }

    //Method 2 -->This getPrice uses input one parameter for discount that you will take off from the original price
    //retuen after discounted price 
    public double getPrice(double d){
        discount = d;
        return stickerPrice - discount;
    }

    //Method 3 -->This getPrice uses 2 input parameters: one for discount, one for trade-in
    //Deduct trade-in first, then take off discount from the original price, return after calculated price
    public double getPrice(double d, double t){
        discount = d;
        trade_in = t;
        return (stickerPrice - trade_in) - discount;
    }

    //Task 3: Create a method to calculate the average MPG for a list of 5 cars
    public double getAverageMPG(){
        double average = 0.0;
        for(int i = 0; i < carArray.length; i++){
            average += carArray[i].mpg;
        }
        average /= carArray.length;
        return average;
    }

    // Add the following codes for main()
    public static void main(String args[]){
        OL_whatCar_Paulski st = new OL_whatCar_Paulski(5);
        //create 3 whatCar objects following the directions below
        //whatCar #1 
        st.addCars(2000, 25000.00, "Ford", "F-150", "white", 18);
        //Use deafult constructor
        //print out the sticker price using the following format
        // Make   Model   Year    Color   Price
        // -------------------------------------

        //whatCar #2
        st.addCars(2018, 50000.00, "Lexus", "RX-300", "beige", 26);
        //Use specific model 2014 Lexus RX-300 beige 50,000 sticker price
        //Print out 3 differet prices with the following format
        // Make   Model   Year    Color   Sticker_Price  Sales_Price With Trade-in
        // ------------------------------------------------------------------------

        //whatCar #3
        st.addCars(2000, 120600.00, "Porsche", "911 Carrera 4S", "black", 38);
        //create a list of 5 cars with different make model year price MPG
        //Modify the necessary constructor to make this happen
        //Use this class OL_whatCar_Paulski as data type
        //Call getAverageMPG() with the CO array and return with the average MPG
        //Print out the outcome with the following format
        // Make   Model   Year    Price     MPG
        // --------------------------------------
        // xxxxx
        // xxxxx  (5 of them)
        // Average MPG = _________

        //whatCar #4
        st.addCars(2016, 70000.00, "Mercedes", "S-Class Sedan", "grey", 34);

        //whatCar #5
        st.addCars(2018, 69430.00, "Chevrolet", "Tahoe", "black", 25);
        
        System.out.println("The car mpg average is " + st.getAverageMPG());
    }
}
