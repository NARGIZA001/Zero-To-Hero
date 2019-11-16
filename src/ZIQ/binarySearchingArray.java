package ZIQ;
import java.util.Arrays;

public class binarySearchingArray {



 public static void main(String[] args) {

            // initializing unsorted array
            Object arr[] = {10,2,1,22,69,90};

            // sorting array
              Arrays.sort(arr);

            // let us print all the elements available
            System.out.println("The sorted array is:");


            for (Object number : arr) {

                System.out.println("Number = " + number);
            }

            // entering the value to be searched
            int searchVal = 22;

            int retVal = Arrays.binarySearch(arr,searchVal);

            System.out.println("The index of element 22 is : " + retVal);


     System.out.println("================================================");




                int arry[] = { 10, 20, 15, 22, 35 };
                Arrays.sort(arr);

                 int key = 22;
                 int res = Arrays.binarySearch(arr, key);
                 if (res >= 0)


                 System.out.println(key + " found at index = " + res);
                 else System.out.println(key + " Not found");

                 key = 40;
                 res = Arrays.binarySearch(arr, key);

                 if (res >= 0) {
                     System.out.println(key + " found at index = " + res);
                 } else{
                     System.out.println(key + " Not found");
                 }

 }
}


