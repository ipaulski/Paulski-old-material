import java.util.*;
public class Car_Paulski
{
    public String make, model, lpNumber;
    private int year;
    public ArrayList<Car_Paulski> cars = new ArrayList<Car_Paulski>();
    public Car_Paulski(){}
    
    public Car_Paulski(String ma, String mo, int y, String lp){
        make = ma;
        model = mo;
        year = y;
        lpNumber = lp;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int y){
        year = y;
    }
    
    public String getMake(){
        return make;
    }
    
    public void setMake(String s){
        make = s;
    }

    public String getModel(){
        return model;
    }
    
    public void setModel(String s){
        model = s;
    }
    
    public String getLPNumber(){
        return lpNumber;
    }
    
    public void setLPNumber(String s){
        lpNumber = s;
    }
    
    public String toString(){
        return "make:" + make + "]" + "model:" + model +
        "]" + "year:" + year + "]" + "LicensePlate:" + lpNumber + "]";
    }
    
    //task 2 create a method printAll
    public void printAll(ArrayList<Car_Paulski> cars){
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
    
    public static void main(String[] args){
        ArrayList<Car_Paulski> cars = new ArrayList<Car_Paulski>();
        Car_Paulski som = new Car_Paulski();
        //task 1
        som.cars.add(new Car_Paulski("Acura", "ILX", 2016, "X1323"));
        //task 3
        som.cars.add(new Car_Paulski("Toyota", "Corolla", 2013, "G665T"));
        som.cars.add(new Car_Paulski("Toyota", "Camry", 1993, "XXC778"));
        som.cars.add(new Car_Paulski("Ford", "F150", 2004, "SS098"));
        som.cars.add(new Car_Paulski("Bentley", "Cordia", 2014, "888"));
        //task 4
        som.printAll(cars);
        //task 5
        for(int i = 0; i < cars.size(); i++){
            if(som.cars.get(i).model==("Camry")){
                cars.add(i, new Car_Paulski("Bugatti", "Veyron", 2011, "BADMOFO"));
            }
        }
        //task 6
        som.printAll(cars);
        //task 7
        for(int i = 0; i < cars.size(); i++){
            if(som.cars.get(i).make==("Bentley")){
                cars.set(i, new Car_Paulski("Bentley", "Cordia", 2017, "888"));
            }
        }
    }
    }
