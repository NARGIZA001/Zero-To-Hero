package Exceptions;

public class myBankAcc {
    public void transaction (int amount ) throws Exception{
        System.out.println("your transaction is over the balance ");
        throw new Exception("your transaction is over the balance ");
    }

    public void  deposit(int amount ) throws NullPointerException{
        System.out.println("Yout deposit amount is less than $10");
        throw new NullPointerException("Your deposit amount is less than $10");
    }

    public void withDraw (int amount ) throws RuntimeException{
        System.out.println("You are withdrawing more than your balance.");
        throw new RuntimeException("You are withdrawing more than your balance ");
    }
}
