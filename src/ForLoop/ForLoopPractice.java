package ForLoop;

public class ForLoopPractice {


    public static void main(String[] args) {


        //int num; int num1;

        // inside for loop we can only put two times ';'
        // both data type should be same.
        // we can not put more than two semicolon inside loop initialization block


        for(int i=0,k=10;i<k;i++){



        }


        for(int i=0;i<8;i++){

            System.out.println(i); // 0 .. 7
        }

        //System.out.println(i);




        int i=0;

        for(;i<8;i++){// 8

            System.out.println(i); // 0 .. 7
        }

        System.out.println("outside of the loop "+i);// 8


        for(int k=0;k<5;k++){
            int num=5;  // since num is inside loop, I can not use it outside of the loop
            //
            num++;
        }

      // System.out.println(num);// compile time error because, num is inside loop


        int num=0;

        for(int k=0;k<5;k++){ // k= 1 k= 4 5
          // num=5;  // since num is inside loop, I can not use it outside of the loop
            num++;// 5
        }

        System.out.println(num);// 5

        // You can not use the variables outside of the loop if you declare them inside loop.
        // if you declare the variables outside of the loop, you can use them inside loop.


        int s=0;
        double d=10;

        for(s=0, d=10; s<d;s++){

            System.out.println("hello");

        }

    }
}
