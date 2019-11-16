package MethodsPractice;

public class TestHermesBags {
    public static void main (String [] args ){


        hermesBags bag1=new hermesBags();
        bag1.color="Green";
        bag1.style="Crock Leather";
        bag1.year=2018;
        bag1.price=35000;


        hermesBags bag2=new hermesBags();
        bag2.color="Burgundy";
        bag2.style="Buffalo Leather";
        bag2.year=2019;
        bag2.price=40000;


        bag1.CrockStyle();
        System.out.println(bag1.BagPrice());
        System.out.println(bag1.BagProductionYear());
        System.out.println(bag1.style);
        System.out.println(bag1.color);

        bag2.BuffaloStyle();
        System.out.println(bag2.BagPrice());
        System.out.println(bag2.BagProductionYear());
        System.out.println(bag2.style);
        System.out.println(bag2.color);
        System.out.println("Current price is $"+ bag2.changePrice(25000));











    }
}
