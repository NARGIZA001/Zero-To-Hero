package Exceptions;

public class CreditCardAccount extends myBankAcc {

    @Override

    public void transaction (int amount ) throws NullPointerException{
        // if class is inheriting the method and overriding the method
        // we need to put same Exception class  or sub class fo that Exception

        System.out.println("your crossing credit card limit ");
        throw new NullPointerException ("your crossing credit card limit");
    }

    @Override

    public void  deposit(int amount ) throws NullPointerException{

        System.out.println("Paying off my balance ");

    }

    @Override

    public void withDraw (int amount ) throws NumberFormatException {
        System.out.println("You are withdrawing more than your balance.");

    }
}
