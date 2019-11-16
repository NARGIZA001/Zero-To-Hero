package MethodsPractice;

import java.util.Arrays;

public class homeWork {


        public int [] homework(int [] arr) {

            int [] result=new int [3];

            Arrays.sort(arr);
            result[0]=arr[0];
            result[1]=arr[arr.length-1];
            int sum=0;
            //{5,2,3,10}->20/4=5
            for (int i=0; i<arr.length; i++){
                sum=sum+arr[i]; //0=0+5-> 5=5+2
            }
            int average =sum/arr.length; //20/4=5 to find the average

            result [2]=average;

            return result;




        }

}
