package MethodsPractice;

public class arrayParameter {


    // find numbers between 3 and 7 ;
    // it will take int array as a parameter.
    // Your method should find the int value more 3 and less 7

    public int sum ( int [] arr ) { // functions that can run

    int result =0; // asigned the value 0 because it's a default value

    for (int i=0; i<=arr.length; i++){
        if (arr [i]>3 && arr[i]<7){

            result +=arr[i]; //10+5+4=19



        }

    }

        return  result;

    }

    public static void main ( String [] args ){
        arrayParameter nm=new arrayParameter();
        int [] nums = {4,5,5};
        System.out.println(nm.sum(nums));
    }


}
