package InharitanceOOP2;

public class ScrumMaster extends ScrumTeam {

    int  age;
    double salary;



    public ScrumMaster( int age ){
        super("you","me");

        this.age=age;

    }

    public ScrumMaster(int age, double salary){
        this(age);
        this.salary=salary;


    }
    public ScrumMaster(String pojectName){

        super("Just Do It", "Numpa Hompa");

    }

    @Override


    public void progress (){
        System.out.println("Scrum masters are the organizers. They are responsible for clear communication between the PO and their team. ");

    }

    @Override

    public  void work (){
        System.out.println("Scrum masters work on both sides with PO and team, so they not allowed to take side in fact they always look for middle solution.");
    }

    @Override

    public  void sprint (){
        System.out.println("Scrum masters must attend sprint meetings");

    }


}
