package IfStatement;

import java.util.Scanner;

public class CarSpeed {

    // using Scanner enter FIVE different input
    // 1- gasPedal -- true/false
    // 2- breakPedal-- true/false
    // 3- gasPedalPercentage -- number
    // 4- Enter current speed
    // 5- Enter speed limit

    // IncreaseSpeed= currentSpeed<speedLimit , gas pedal equals true,
    // gasPedalPercentage more than 20 percent
    // breakPedal should be false

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please provide the current speed");

        int currentSpeed=input.nextInt();

        System.out.println("Please provide the speed limit");

        int speedLimit=input.nextInt();

        System.out.println("Please provide the Gas Pedal");

        boolean gasPedal=input.nextBoolean();

        System.out.println("Please provide the Break Pedal");

        boolean breakPedal=input.nextBoolean();

        System.out.println("Please provide the Gas Pedal Percentage");

        int gasPedalPercentage=input.nextInt();

        boolean increaseSpeed=currentSpeed<speedLimit && gasPedalPercentage>20 &&
                gasPedal==true && breakPedal==false;

        System.out.println("Can I increase the speed? "+increaseSpeed);

                // percentage=20  --> it will stay same speed
                // percentage<20  --> decrease speed
                // percentage>20  --> increase speed

    }


}
