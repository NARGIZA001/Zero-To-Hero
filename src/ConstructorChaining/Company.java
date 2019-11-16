package ConstructorChaining;

public class Company {

    String name;
    String location;
    String area;
    int employeeNumber;
    int budget;


    public Company (){

    }

    public Company (String name, String location, String area){

        this.name=name;
        this.location=location;
        this.area=area;
        this.employeeNumber=employeeNumber;
        this.budget=budget;


    }

    // create constructor to initialize all the instance variables.


    public Company (String name, String location, String area,int employeeNumber){

        this (name,location, area);

        this.employeeNumber=employeeNumber;


        // you can not create

    }
    public Company (String name, String location, String area,int employeeNumber, int budget){

        this (name,location, area,employeeNumber);

        this.budget=budget;

    }

    public void displayCompanyInfo(){
        System.out.println("company "+ name);
        System.out.println("location "+ location);
        System.out.println("area "+ area);
        System.out.println("employer "+ employeeNumber);
        System.out.println("budget "+ name);

    }
    public static void main(String [] args ){

        Company company = new Company();

        Company company1=new Company ("zara", "NY", "Retail");
        System.out.println(company1.name);
        System.out.println(company1.employeeNumber);
        company1.employeeNumber=50;
        System.out.println(company1.employeeNumber);


        Company company2=new Company("Chase","Chicago","Fiannce",400,200000);
        System.out.println(company2.name);
        System.out.println(company2.employeeNumber);
        System.out.println(company2.budget);

        company2.displayCompanyInfo();





    }
}
