package MethodsPractice;

public class ProfitCalculator {
    int price;
    int quantity;
    int rate1;
    int rate2;

    public int sell (int price, int quantity){
        return price*quantity;

    }

    public double sell10dis(int price, int quantity){
        return price*quantity*0.9;

    }

    public double sell20dis(int price, int quantity){
        return price*quantity*0.8;
    }

}
