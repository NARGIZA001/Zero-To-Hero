package CarInventory;

public class Car {

    private String name, model, vinNumber; // instance variables it's privet so we need to set up getter and setter
    private int year, price;

    public Car(){

    } //constructor with no parameter

    public  Car (String name){
        this.name=name;
    } //constructor with 1 parameter

    public Car (String name, String model, int price, int year, String vinNumber){ //constructor with 4 new parameter and 1 from other parameter
        this (name);
        this.model=model;
        this.price=price;
        this.year=year;
        this.vinNumber=vinNumber; // initializing instance variables

    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name=name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }




}

