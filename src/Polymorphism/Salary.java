package Polymorphism;

public class Salary extends Employee {

    private double salary; // annual salary

    public Salary(String name , String address, int number , double salary ){

        super (name , address, number ); // imlimenting the same way the parent classs has the constructor .

        this.salary=salary;

    }

    public void mailCheck (){
        System.out.println("Within mailCheck of Salary Class ");
        System.out.println("Mailing check to "+ getName()+ " with salary "+ salary);

    }

    public double getSalary(){
        return salary;


    }

    public void setSalary(double newSalary ){
        if (newSalary >= 0.0){
            salary=newSalary;
        }
    }

    public double computePay(){
        System.out.println(" Computing salary pay for "+ getName());
        return salary/52;

    }
}
