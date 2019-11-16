package PolymorphismOOP2;

import java.util.*;

public class Family {

    public static void main(String[] args) {
        human h=new Baby(); //reference side is the super class ... object side could be baby, boy , man, woman

        h.eat();
        h.shave();
        h.walk();
        ((Baby)h).crawl();

       // ((women)h).makeUP(); //regular method we will get an expection


        ((Dad)h).feed();// dynamic method

        System.out.println("-------------------");

        man m=new Boy(); // polymorphism object, it will get the methods from Boy class thus it will bring all the methods from Boy class

        m.playSport();

        ((Boy)m).cry();
       // ((Baby)m).cry();//you need to always cast one class above

        m.humanMethod();

        // if you are opening the object of Boy you must explicitly down cast the boy class For example ((Boy)m).cry();

        Dad d=new Baby();
        d.feed();

        ((Boy)d).run(); // down cast to BOY class to get the run method












    }
}
