package ArrayPractice;

import java.util.Arrays;

public class Task_Mentoring {
    public static void main(String[] args) {
        // TASK #1

        // careate arr of int; assign 10 nums 0-100;
        // print in reverse order separated by space

        int num []= {4,7,5,15,38,56,0,3,9,9};

        for (int i=num.length-1; i>=0; i--){
            System.out.println(num[i] + " ");
        }
        int z= num.length-1;

        // second option for TASK

        while (z>=0) {

            System.out.println(num[z--]+ " ");

            // or Z--

        }

        // TASK #2

        // crate arr  of int; assign 10 nums 0-100;
        // print sum of array
        // for each loop can't go backward always from begining to the end

        int sum =0;

        for (int s: num ) {

            sum=sum+s;
           // System.out.println(sum);
        }

        System.out.println(sum);


        // {3,0,0,6,7,0,0,7,6,5}
        // {3,6,7,7,6,5,0,0,0,0}

        int num2 []={3,0,0,6,7,0,0,7,6,5};

        int size= num2.length;

        int num3 []=new int [size];

        int index =0;

        for (int i=0; i<num2.length; i++) {

            if (num2[i]!=0){

                num3[index]=num2[i];

                index++;
            }
        }

        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));


    }

}
