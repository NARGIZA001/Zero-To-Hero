package InharitanceOOP3;

public class testCompany {
    public static void main(String[] args) {
        Company company=new Company("Google");

        System.out.println(company.employees());
        System.out.println(company.buildings());
        System.out.println(company.hire());


        System.out.println("================================");
        IT it=new IT();
        System.out.println(it.employees());
        System.out.println(it.buildings());
        System.out.println(it.hire());


    }
}
