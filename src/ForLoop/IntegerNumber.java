package ForLoop;

public class IntegerNumber {


    public static void main(String[] args) {

        int number=125;

        // If second value is bigger than the first number remainder will be always first number
        // 2%5=2
        // 11%12= 11
        // 8%9= 8
        // 8%8=0
        // number%10=5
        // int num1=653
        // last=num1%10=3
        // num1=num1/10; 65
        // last=num1%10; 5
        // num1=num1/10; 6
        // last=num1%10; 6%10 = 6
        // num1=num1/10; 6/10=0
        // if(num1==0){
        // break;}

        // 15%10= 5

        for(int i=0;i<3;i++){

            System.out.println(number%10);// 5 2 1
            number=number/10; //12 / 10 = 1/10 = 0

        }



    }
}
