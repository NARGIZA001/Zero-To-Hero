package ArrayListPractice;

import java.util.ArrayList;

public class CarC {

    String name, model;
    int price, year;
    long vinNumber;



    public CarC(){

    }

    public CarC(String name){

        this.name=name;


    }
    public CarC(String name, String model, int price, int year, long vinNumber){
        this.name=name;
        this.model=model;
        this.price=price;
        this.year=year;
        this.vinNumber=vinNumber;


    }

    public void  printNames(ArrayList carList){


        for(int i=0; i<carList.size(); i++){
            if (name.equalsIgnoreCase(name)){
                System.out.println(carList.get(i));
            }
        }

    }

    public void printPrices(ArrayList carPrice){

        for(int i=0; i<carPrice.size(); i++){
            if (price==price){
                System.out.println(carPrice.get(i));
            }
        }
    }


    public void changeYear(int newYear, long vNumber){
        if (vinNumber==vNumber){
            System.out.println(year=newYear);
        }


     }

     public void changePrice (int newPrice, long vNumber){

        if (vinNumber==vNumber){
            System.out.println(price=newPrice);
        }
     }

     /*public void newCar ( String newname, String newmodel, int newprice, int newyear, long newvinNumber){

        if (vinNumber==newvinNumber && model==newmodel && price==newprice && year==newyear && name==newname){

            System.out.println("CarInventory is already in stock! ");
        }else{
            System.out.println("this is a new car lets add this car in the system");
        }

     }

     public void removeCar ( String newname, String newmodel, int newprice, int newyear, long newvinNumber){
        if (vinNumber==newvinNumber && model==newmodel && price==newprice && year==newyear && name==newname) {
            System.out.println("You already have this one lets remove this car");
         }

     }*/

}

