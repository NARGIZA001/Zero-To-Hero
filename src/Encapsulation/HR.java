package Encapsulation;

public class HR {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setFirstName("Lisa");
        employee.setFirstName("JOhn");
        employee.setAge(25);
        employee.setEmployeeID("A439HJ");
        employee.setSSN(127640485);
        employee.setGender('M');
        employee.setSalary(110000);
        System.out.println(employee.getAge());
    }
}
