package ZIQ;

public class CanBalance {

    public static void main(String[] args) {

        int [] arr =new int [] {2,1,1,2,3,1};

        // 1 sum /2 % ==0 continue checking

        System.out.println(canBalance(arr));



    }

    public static boolean canBalance (int [] arr){
        //[1,1,1,2,1,]--true
        //[2,1,1,2,3,1]--false can't split the array by half
        //[2,1,2,1,1 ]--

        int sum=0;

        for (int i: arr){
            sum+=i;
        }
        if (sum%2!=0) return false;

        int targetNum= sum/2; // 3

        for (int j: arr){

            targetNum-=j;

            if (targetNum==0) return true;

            if (targetNum <0) break;
        }

        return false;
    }
}
