package DoWhileLoop;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {


        String password ="let me in";
        Scanner scanner =new Scanner(System.in);
        String guess;

        do{
            System.out.println("Please enter your password ");

            guess=scanner.nextLine();

        }while (!guess.equals(password)); // and while the password is not equals to the  password we will be keep asking .

        System.out.println("Congrats");

    }
}

