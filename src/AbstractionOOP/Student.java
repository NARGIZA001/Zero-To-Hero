package AbstractionOOP;

public abstract class Student {
    int studentId;
    String studentName;

    public abstract void study ();
    abstract void attendClass ();
    public void homeWork(){
        System.out.println("i have to study and do my home works ");
    }
}
