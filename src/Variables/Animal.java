package Variables;

public class Animal {

    /*
    In Farm we have 23 cow and 42 chicken
    Calculate the total number of leg in this farm

    ** One cow price is $2000
    ** One chicken price is $20

    calculate total price for all animals in the farm


     */

    public static void main(String[] args) {

        int cow=23;
        int chicken=42;

        int cowLegs=cow*4;
        int chickenLegs=chicken*2;

        int totalNumberLegs=cowLegs+chickenLegs;

        System.out.println("Total Number of legs is "+totalNumberLegs);

        System.out.println("Animal "+(cow+chicken));

        // Animal 65
        // Animal 2342
        int totalCowPrice=cow*2000;
        int totalChickenPrice=chicken*20;

        int totalAnimalPrice=totalCowPrice+totalChickenPrice;

        System.out.println("Total Animal price is $"+totalAnimalPrice);


    }


}
