package InharitanceOOP2;

public class ProductOwner extends ScrumTeam {

    int  age;
    double salary;



    public ProductOwner ( int age ){
        super("you", "me ");
        this.age=age;

    }

    public ProductOwner (int age, double salary){
        this(age);
        this.salary=salary;


    }


    public ProductOwner (String pojectName){

        super("Just Do It", "Let's go");


    }


    @Override


    public void progress (){
        System.out.println("Product owners'  progress  depends on how fast Scum Team works ");

    }

    @Override

    public  void work (){
        System.out.println("Product owners are those who plan the project and they are the only ones who change the order of items in the backlog ");
    }

    @Override

    public  void sprint (){
        System.out.println("Product owners are  required to attend sprint meetings");

    }
}

