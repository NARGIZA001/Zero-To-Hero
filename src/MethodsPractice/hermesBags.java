package MethodsPractice;

import java.sql.SQLOutput;

public class hermesBags {
    String color;
    String style;
    int  year;
    int price;


    public void CrockStyle(){
        System.out.println(color+" "+" "+ style + " is in fashion ");

    }

    public int BagPrice(){
        return price; //  get price method

    }
    public int BagProductionYear(){
        return year ; // get year method

    }
    public void BuffaloStyle(){
        System.out.println(color+" "+" "+style+ " is old fashion");
    }
    public int changePrice(int newPrice) {
        price = newPrice;
        return BagPrice();
    }
}
