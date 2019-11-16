package ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class CarInventory {
    public static void main(String[] args) {

        CarC car1=new CarC("Tayota","Corolla",11000, 2000,91827364l);
        CarC car2=new CarC("Mersedec","Gellenvagen",12000, 2001,918256892l);
        CarC car3=new CarC("Honda","Melissa",13000, 2002,337273664l);
        CarC car4=new CarC("Hundai","Triolla",14000, 2003,918476970l);
        CarC car5=new CarC("Acura","Drum",15000, 2004,86425364l);
        CarC car6=new CarC("Infinity","King",16000, 2005,1234689l);
        CarC car7=new CarC("BMW","Sport",17000, 2006,65787364l);
        CarC car8=new CarC("Rolls Rois","Lambada",18000, 2007,76857364l);
        CarC car9=new CarC("Range Rover","Mover",19000, 2008,89457364l);
        CarC car10=new CarC("Bently","Rich",20000, 2009,000127345l);

        List <CarC> carList =new ArrayList();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);



        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).name);
            System.out.println(carList.get(i).price);
        }

        for (int i=0; i<carList.size(); i++){
            carList.get(i).changeYear(2015,91827364l);
            System.out.println(carList.get(i).year);
        }

        for (int i=0; i<carList.size(); i++){
            carList.get(i).changePrice(1250, 918256892l);
            System.out.println(carList.get(i).price);
        }

        /*CarInventory car11=new CarInventory("Bently","Rich",20000, 2009,000127345l);

        for (int i=0; i<carList.size(); i++) {
            carList.get(i).newCar("Bently", "Rich", 33333, 5555, 000127345l);
            System.out.println(carList.add(car11));
        }

        for (int i=0; i<carList.size(); i++){
            carList.get(i).removeCar("Bently", "Rich", 33333, 5555, 000127345l);
            System.out.println(carList.remove(i));


        }*/



    }
}
