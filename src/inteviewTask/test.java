package inteviewTask;

public class test {
    public static void main(String[] args) {
        programmarTeacher teacher=new programmarTeacher();
        teacher.addLanguages("Java");

        programmer Programmer =new programmer();

        System.out.println(teacher.teach(Programmer, "Java"));
    }
}
