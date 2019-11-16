package IfStatement;

        import java.util.Scanner;

public class BankOfAmerica {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the username");

        String username=input.next();

        // username
        // password
        // captca

        if(username.equals("mturan")){

            System.out.println("Please enter the Password");
            String password=input.next();

            if(password.equals("DesPlaines21")){

                System.out.println("Please enter the Captcha");

                String captcha=input.next();
                if(captcha.equals("beam")){

                    System.out.println("Welcome to Bank Of America");
                }else{

                    System.out.println("Captcha is wrong");
                }

            }else{

                System.out.println("Password is wrong");
            }

        }else{

            System.out.println("Username is wrong");
        }


    }
}
