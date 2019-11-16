package ArrayPractice;

import java.util.Scanner;

public class scoreBoard {
    public static void main(String[] args) {
        char[] team= {'A', 'B','C'};
        // USER SHOULD INPUT SCORE NUMBER FOR EACH TEAM
        // PLEASE ENTER SCORE FOR TEAM B
        //...
        //
        //A***
        //B*****
        //C*

        Scanner input =new Scanner (System.in);
        System.out.println(" please enter A score ");
        int a=input.nextInt();
        System.out.println(" please enter B score ");
        int b=input.nextInt();
        System.out.println(" please enter C score ");
        int c=input.nextInt();

        for (char t: team){
            if (t=='A'){
                String stars="";
                for (int i=0; i<a; i++){
                    stars= stars + "*";
                }
                System.out.println(t+stars);// a*******


            }else if (t=='B') {
                String stars = "";
                for (int i = 0; i < b; i++) {
                    stars= stars + "*";
                }
                System.out.println(t+stars);// b*****




            }else if (t=='C') {
                    String stars="";
                    for (int i=0; i<c; i++){
                        stars= stars + "*";
                    }
                System.out.println(t+stars); //c******


            }else if (t=='A'){
                String stars="";
                for(int i = -a; i >= 0; i--){

                    System.out.println(stars+t);
                }
            }

        }




    }
}
