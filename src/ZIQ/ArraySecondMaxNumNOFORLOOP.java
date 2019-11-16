package ZIQ;

import java.util.Arrays;

public class ArraySecondMaxNumNOFORLOOP {

        public static int findMax (int [] arr) {

            if (arr.length==0) return 0;

            int maxNum= arr[0]; // assigning to the first number to the first element .

            for (int i: arr){
                if (i>maxNum) maxNum=i;//now maxNUm would be assigned to the every MaxNum .
            }
            return maxNum;
        }

    public static int findSecondMax (int [] arr) {

        if (arr.length < 2) return 0;

        // assumption of positivite numbers

        int maxNum = arr[0], secondMax = arr[0]; // ZEROS are the positive numbers.

        for (int i : arr) {
            if (i > maxNum) {
                secondMax=maxNum;    // assigning the last maxNumber to the secondLast number will make sure you are getting the last second max number in Array
                maxNum = i;          //now maxNUm would be assigned to the every MaxNum .

            } else if (i < maxNum && i > secondMax) secondMax = i;

        }
        return secondMax;
    }


    public static void main(String[] args) {

        int [] arr = {100,5,200,8,198,40,60,90};


        System.out.println((findMax(arr)));

        System.out.println(findSecondMax(arr));
    }
}
