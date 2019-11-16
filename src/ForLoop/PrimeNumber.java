package ForLoop;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("2");

        int count=0;

        // 3 -- 100 // 20%2=0 2,3 4 5 6.. 18

        // all the prime numbers odd number except 2.
        // 40 50 24
        //

        for(int i=3;i<100;i++){

            for(int k=2;k<i;k++){

                if(i%k==0){
                   count++;

                }

            }
            if(count>0){ // 1 > 0 true

               // System.out.println(i+"");
            }else{
                System.out.println(i+"is prime number");
            }

            count=0;
        }
        // 2/2
        // 13%2==1
    }
}
