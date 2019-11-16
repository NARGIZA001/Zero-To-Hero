package InharitanceOOP2;
public class Developer extends ScrumTeam {

    int  age;
    double salary;


    public Developer (int age ){

        super("you","me");

        this.age=age;

    }

    public Developer (int age, double salary){
        this(age);
        this.salary=salary;


    }


    public Developer (String pojectName){

        super("Just Do It", "lollypop");


    }


    @Override


    public void progress (){
        System.out.println("Developer's team progress  stage depends on how much they have to do");

    }

    @Override

    public  void work (){
        System.out.println("Developer's team work  level is high");
    }

    @Override

    public  void sprint (){
        System.out.println("Developer's team  must attend sprint meetings daily stand up meetings");

    }

}
