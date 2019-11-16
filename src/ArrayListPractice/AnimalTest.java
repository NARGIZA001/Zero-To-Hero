package ArrayListPractice;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal1= new Animal("Crocodile",3,"Jungle",1);
        Animal animal2= new Animal("Girafe",1,"Jungle",4);
        Animal animal3= new Animal("Parot",5,"Jungle",3);
        Animal animal4= new Animal("Panda",6,"Jungle",5);
        Animal animal5= new Animal("Tiger",7,"Jungle",2);

        System.out.println(animal5.dailyMeal);

        System.out.println(animal1.IncreaseDailyMeal(10));

        ArrayList <Animal> animlist =new ArrayList (); // my data type is Animal

        animlist.add(animal1);
        animlist.add(animal2);
        animlist.add(animal3);
        animlist.add(animal4);
        animlist.add(animal5);


        for (int i=0; i<animlist.size(); i++){

            animlist.get(i).IncreaseDailyMeal(10);
            System.out.println(animlist.get(i).dailyMeal);
        }



    }
}
