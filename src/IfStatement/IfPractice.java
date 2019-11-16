package IfStatement;

public class IfPractice {


    public static void main(String[] args) {

        int averageScore=50;

        if(averageScore>=70){

            System.out.println("Student pass the classes. Average score is "+averageScore);

        }else{

            System.out.println("Student could not pass the class "+averageScore);

        }


        // average scrore >= 70 ->   passed
        // average < 70 ---      >   failed

        int saving=1000;

        boolean passport=true;

        boolean ticket=true;

        if(saving>=2000 && passport==true && ticket==true){

            System.out.println("I can go to the Mexico");

        }








    }

}
