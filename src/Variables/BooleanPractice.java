package Variables;

public class BooleanPractice {

    public static void main(String [] args){


        boolean isLightOn=true;

        isLightOn=false;

        isLightOn=!false;

        System.out.println(isLightOn);

        int currentSpeed=60;

        int speedLimit=50;

        boolean increaseSpeed=currentSpeed<speedLimit;//false

        boolean decreaseSpeed=currentSpeed>speedLimit; //true

        System.out.println("Increate speed is "+increaseSpeed);

        System.out.println("Decrease speed is "+decreaseSpeed);

        // Think that your driving the car
        // your current speed is 30 however the speed limit 50
        // increase = true;
        // decrease = false;


        // avarage tempurature for the room is 72F
        // if currentTemperature is less than 72F increase
        // current temprature is more 72F decrease

        int currentTemp=60;
        int avarageTemp=72;

        boolean increaseTemp=currentTemp<avarageTemp; // 60 < 72
        boolean decreaseTemp=currentTemp>avarageTemp; // 60 > 72

        System.out.println("Increase temp is "+increaseTemp);
        System.out.println("Decrease temp is "+decreaseTemp);

        // Sell the alcohol if person age is more than or equals to 21
        // don't sell alcohol if person age is less than 21

        int personAge=18;

        int legalAge=21;

        boolean sellAlcohol=personAge>=legalAge; //18>=21; false
        boolean dontSellAlcohol=personAge<legalAge; // 18<21 true

        System.out.println("Sell the alcohol "+sellAlcohol);
        System.out.println("Don't sell the alcohol "+dontSellAlcohol);


        // if you have 500000 you can buy 5 room single house
        // if you don't have 500000 you can not buy the 5 room single house
        // your current saving is 120000

        int housePrice=500_000;
        int currentSaving=620_000;

        boolean buyHouse=currentSaving>=housePrice;

        boolean dontBuyHouse=currentSaving<housePrice;

        System.out.println("Buy house if you have enough money "+buyHouse);
        System.out.println("Don't buy house if you don't have enough money "+dontBuyHouse);


        // Fridge currentDegree 50f  avarage degree 32f

        // if currentTemperature is bigger than avarage temperature then
        // decrease the temperature

        // event organization
        // if person age is less 18 year don't invite
        // person age is bigger than or equals 18 you can invite
        // int personAge=21;
        // boolean invitePerson=personAge>=18;
        // boolean donotInvite=personAge<18;

    }


}
