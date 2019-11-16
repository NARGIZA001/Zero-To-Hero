package Variables;

public class OperatorPractice {


    public static void main(String [] args){

        // Re-assigning the variables

        /*
        Variables can be assigned and re-assigned
        many times after declaring
         */

        int apple=7, banana, orange=13;

        banana=9;

        banana=1;

        banana=4;

        System.out.println("Banana number is "+banana);

        banana=8;

        System.out.println("Banana number is "+banana);

        //banana = 8
        //apple =7
        banana=apple;
        //banana=7
        //apple=7
        apple=banana;
        //banana=7
        //apple=7

        System.out.println("Banana number is "+banana);

        System.out.println("Apple number is "+apple);

        System.out.println("Orange number is "+orange);

        //banana=7
        banana=banana+1;
        // banana=7+1;
        //banana=8
        System.out.println("Banana number is "+banana);

        //orange=13
        banana=orange+1;
        //banana = 14

        System.out.println("Banana number is "+banana);

        System.out.println("Orange number is "+orange);


        banana+=1;
        // banana = banana+1;
        // banana=15

        System.out.println("Banana number is "+banana);

        banana-=2;
        // banana= banana-2;
        // banana= 15-2;
        // banana=13

        System.out.println("Banana number is "+banana);

        banana*=2;
        // banana=banana*2;
        // banana=13*2;
        // banana=26

        System.out.println("Banana number is "+banana);

        orange%=5;
        // orange = orange%5;
        // 5+5+3
        // orange=3

        System.out.println("Orange number is "+orange);

        double taxAmount=10.5;
        float salary=40.7f;
        int number=100;


        // 151.2
        double totalAmount=taxAmount+number+salary;


        byte k=10;
        short n=8;

        int totalNumber=k+n;

        // totalNumber=k*n;
        // totalNumber=k-n;
        // totalNumber=k%n;
        // totalNumber=k/n;


        int berry=14;

        System.out.println(berry);

        System.out.println(berry++);// 14

        System.out.println(berry);//15

        berry=berry++;

        System.out.println(berry);//16


    }


}
