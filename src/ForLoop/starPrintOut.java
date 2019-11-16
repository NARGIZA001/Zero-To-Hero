package ForLoop;

public class starPrintOut {
    public static void main(String[] args) {
        int i=9;

        while (i >=0){ // using while to create stars as triangle
            int k=i;
            while (k>=0){
                System.out.print(k+" ");
                k--;

            }
            System.out.println();
            i--;
        }


       /* for ( i=9; i>=0; i--){                     // using for loop to output triangle numbers
            for (int k=i; k>=0; k--){
                System.out.print(k+" ");

            }

        }*/
    }
}
