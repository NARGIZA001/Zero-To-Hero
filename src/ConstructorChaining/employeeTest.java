package ConstructorChaining;

import java.nio.channels.NotYetBoundException;

public class employeeTest {

public static void main (String [] args ){

    Employee employee =new Employee();

    Employee employee1=new Employee("Diana",2,30,40,"New York");

    System.out.println(employee1.getName());
    System.out.println(employee1.getAge());
    System.out.println(employee1.getEmploymentYear());
    System.out.println(employee1.getLocation());
    System.out.println(employee1.getWorkHour());
    System.out.println(employee1.calculateSalary());
    System.out.println(employee1.yearlySalary());
    System.out.println(employee1.calculateBonus(2,245));


}
}
