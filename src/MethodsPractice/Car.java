package MethodsPractice;

public class Car {
    String model;
    int  year;
    String make;
    int price;
    public void drive(){
        System.out.println(model+" "+" "+ make + " is driving ");

    }

    public int getPrice(){
        return price; //  get price method

    }
    public int getYear(){
        return year ; // get year method

    }
    public void stop(){
        System.out.println(model+" "+" "+ make + " is stopping");
    }
    public int changePrice(int newPrice){
        price=newPrice;
        return getPrice();
    }
}
