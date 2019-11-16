package Variables;

public class LogicalOperators {

    public static void main(String [] args){



        boolean hasVisa=true;
        boolean hasTicket=true;

        boolean canCome=hasVisa&&hasTicket;

        System.out.println("Can I come to the USA? "+canCome);


        boolean finishedESL=true;
        int ToeflScore=78;
        boolean passToefl=ToeflScore>=79;// 78 is bigger than 79 == false

        boolean canGoToCollege=finishedESL || passToefl;

        System.out.println("Can go to the college? "+canGoToCollege);



        // To be able to buy the home I should have enough money or
        // I should have a mortgage
        // current money 200.000
        // home price 300.000

        int currentMoney=300_000;
        int homePrice=300_000;

        boolean hasMortgage=false;
        // OR
        boolean hasEnoughMoney=currentMoney>=homePrice; // true

        boolean canBuyHome=hasMortgage || hasEnoughMoney;

        System.out.println("Can I buy the home? "+canBuyHome);

        // I should have driver licence
        // age 16
        // should pass the exam
        // my score is 70
        // expected 75
        // I should have visa

        int myAge=15;
        int expectedAge=16;

        boolean ageRequirement=myAge>=expectedAge; // true

        int myScore=80;
        int expectedScore=75;

        boolean passExam=myScore>=expectedScore;

        boolean hasVisa1=true;
        // age
        // score
        // visa

        boolean canGetDLicense=ageRequirement && passExam && hasVisa1;

        System.out.println("Can I get the driver license? "+canGetDLicense);



    }

}
