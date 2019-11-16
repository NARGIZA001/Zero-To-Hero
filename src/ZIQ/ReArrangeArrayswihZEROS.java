package ZIQ;

import java.util.Arrays;

public class ReArrangeArrayswihZEROS {

    public static int [] rearrangeArrays (int [] arr){
        // creating  a new  Array

        // zeros must be at the end.


        int [] newArr=new int [arr.length]; // [0,0,0,0,0,0,0,0,0,0,0,0]
        int j=0;
        // for loop

        for (int i= 0; i<arr.length; i++){
            if (arr [i]!=0){
                newArr [j]=arr[i];
                j++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {

        int [] arr =new int [] {0,0,2,8,198,0,60,9};


        System.out.println(Arrays.toString(rearrangeArrays(arr)));


    }
}
