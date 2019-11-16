package ZIQ;

import java.util.Arrays;

public class FizzBuzz {
    //[2,4,7,9,15,25]

    // or they can give you (start number and end number )
    // if its multiple of 3->"fiz"
    // if its multiple of 5->"buz"
    // if both ->FizBuz ->15,30,45,60

    public static void main(String[] args) {
        // Proper way to do Array
        // int [] arr =new int [] {3,5,7,8,35,40,60,90};
       // System.out.println(Arrays.toString(arr));



        System.out.println(Arrays.toString(FizzBuzz(new int []{3,5,7,8,35,40,60,90})));


    }

    public static  String [] FizzBuzz (int [] arr) {

        // 1 Create new Array because we are returning the String Array

        //2  Create for loop, check each  element

        //3 if / 3 --> Fizz or  5 --> Buzz

        String [] newArr=new String [arr.length];

        for (int i =0; i<arr.length; i++){
            if (arr [i]%3==0 && arr [i]%5==0){
                newArr[i]="FizzBuzz";
            }else if (arr [i]%3==0){
                newArr[i]="Fizz";
            }else if (arr [i]%5==0){
                newArr[i]="Buzz";
            }else{
                newArr[i]=""+  arr[i];
            }

        }
        return newArr;

    }
}
