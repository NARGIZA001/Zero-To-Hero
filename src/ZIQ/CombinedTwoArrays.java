package ZIQ;

import java.util.Arrays;

public class CombinedTwoArrays {

    public static int [] twoArr (int [] arr1, int [] arr2){
        int [] result =new int [arr1.length+arr2.length];

        for(int i=0; i< arr1.length; i++){
            result[i]=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            result[i+arr1.length]=arr2[i];
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {


    // interwiev question


        int [] num1={1,2,9};
        int [] num2={7,3,5};
        int [] result = new int [num1.length+num2.length];

        for(int i=0; i<num1.length; i++){

            result [i] = num1[i];
        }

        for(int i=0; i<num2.length; i++){

            result [i+num1.length]=num2[i];
        }

        System.out.println(Arrays.toString(result));

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));

        System.out.println(result[result.length-1]); // to get the first max number

        System.out.println(result[result.length-2]); // to get the second max number

        System.out.println(result[0]);

        int [] array1={7,8,9,90};
        int [] array2={1,3,5,7};

        System.out.println(Arrays.toString(twoArr(array1,array2)));



//    int[] num1={2,3,5,10};//4
//    int [] num2={5,1,-9};//3
//    int [] result=new int[num1.length+num2.length];  //4+3=7
//
//        for (int i=0; i< num1.length;i++){​
//         result [i]=num1[i];
//         }
//       for(int i=0; i<num2.length;i++){
//        result[i+num1.length]=num2[i];
//         }
//
//
//        System.out.println(Arrays.toString(result));
//        Arrays .sort(result);
//
//        System.out.println(Arrays.toString(result));
//        System.out.println(result[result.length-1]);

    }

}
