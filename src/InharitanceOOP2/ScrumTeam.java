package InharitanceOOP2;

public class ScrumTeam {

    String teamName, projectName;

    /*public ScrumTeam(){

    }

    public ScrumTeam(String projectName) {
        super();
    }
    */

    public ScrumTeam (String teamName, String projectName){

        this.projectName=projectName;
        this.teamName=teamName;

    }

    public void progress (){
        System.out.println("Scrum teams' progress  stage");

    }

    public  void work (){
        System.out.println("Scrum teams' work  level");
    }

    public  void sprint (){
        System.out.println("Scrum teams'  sprint meetings");
    }

    public static void main(String[] args) {

        ScrumTeam v=new ScrumTeam ("t", "a");



    }
}

