package WhileLoop;

public class WhileLoopPractice {

    public static void main(String[] args) {

        int age=20;

        while(age<26){
            System.out.println("Complete circle");  // 20 , 21, 22, 23, 24, 25
            age++;
        }

        // I wanna print my name 5 times
        int repeatNumber=5;
        int currentNumber=1;

        while(currentNumber<=repeatNumber){

            System.out.println("Muammer");
            currentNumber++; // 3 4 5
        }

         // 40$ in my phone account
        // every call 5$ how many I can call
        // I can call

        int totalAmount=40;
        int oneCall=5;

        while (totalAmount>0){
            System.out.println("I can call");
            totalAmount=totalAmount-5; //35 /30 25 , 20 ...5-5=0
        }


        int spoonNumber=1;

        while (spoonNumber<=10){
            System.out.println(spoonNumber+" spoon");
            spoonNumber++;//4
        }


        // ZERO LOOP ITERATION
        // if you boolean condition is returning false, there will no any iteration
        // you wanna buy the phone. Phone price is 800
        // you have 400$
        // how many time you can buy the phone.

        int phonePrice=800;
        int currentMoney=400;

        while (currentMoney>phonePrice){

            System.out.println("you can buy the phone");
        }

        // INFINITE LOOP
        // IF YOUR BOOLEAN CONDITION IS RETURNING TRUE, YOU WILL BE EXECUTING YOU CODE INFINITE.

        int phonePrice1=800;
        int currentMoney1=700;
        int count=0;
        while (currentMoney1>=phonePrice1){
            System.out.println(count+"you can buy the phone");
            count++;
        }

        // less one minutes



        //


        int phonePrice2=300;
        int currentMoney2=2000;
        int count1=1;

        while (currentMoney2>=phonePrice2){

            System.out.println(count1+" I can buy");

            currentMoney2=currentMoney2-phonePrice2; // 1 loop=2000-500= 1500 2 loop = 1500-500=1000; 0
            count1++;
        }


    }

}
