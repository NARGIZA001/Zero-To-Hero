package InharitanceOOP2;

public class SDET extends ScrumTeam {

    int  age;
    double salary;


    public SDET ( int age ){
        super("you","me");

        this.age=age;

    }

    public SDET (int age, double salary){
        this(age);
        this.salary=salary;


    }


    public SDET (String pojectName){

        super("Just Do It", " Paris");


    }


    @Override


    public void progress (){
        System.out.println("SDET team's progress  slow and careful");

    }

    @Override

    public  void work (){
        System.out.println("SDET team's work  level high");
    }

    @Override

    public  void sprint (){
        System.out.println("SDET team's  sprint meetings  must attend sprint meetings and daily stand up meetings");

    }
}

