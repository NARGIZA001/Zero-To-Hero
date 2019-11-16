package AbstractionOOP;

public class TechtorialClass {


    public static void main(String[] args) {

       // Student student=new String ();
        // we can not instantiate (Create an object class )

        campusStudent cs=new campusStudent();
        cs.attendClass();
        System.out.println("==============================");
        OnlineStudents os=new OnlineStudents();
        os.attendClass();
        cs.homeWork();
        os.homeWork();
    }
}
