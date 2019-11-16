package MethodsPractice;

public class bankAccount {

    // create one class called BankAccount
    // there are these instance variables =name, accountNumber, bankName ,
    // balance (double ), expirationDate
    //1-create the method to display all the card information
    //2-create the method to deposit the amount to your bank account
    // this method will take the int parameter as an amount .
    // Return type double
    //3- Create the method to withdraw the money from your account
    //it will take one parameter as an withdraw amount.
    // it will return the double .

        String name;
        String bankName;
        int accountNumber;
        double balance;
        int expirationDate;

        public void displayInfo() {

            System.out.println(name);
            System.out.println(bankName);
            System.out.println(accountNumber);
            System.out.println(balance);
            System.out.println(expirationDate);



    }

    public double deposit(int depositAmount){
            balance=balance+depositAmount;
            return balance;

    }

    public double withdraw(int withdrawAmount){
            balance=balance-withdrawAmount;
            return balance;

    }
    public static void main (String [] args ){
            bankAccount ba=new bankAccount();
            ba.name="Nargiza";
            ba.accountNumber=1987665;
            ba.bankName="Chase";
            ba.expirationDate=2019;
            ba.balance=20;
            ba.displayInfo();
            ba.deposit(1000);
            ba.displayInfo();
            ba.withdraw(480);
            ba.displayInfo();
            ba.withdraw(1000);
            ba.displayInfo();
    }
}



