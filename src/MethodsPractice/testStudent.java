package MethodsPractice;

public class testStudent {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student.age);
        student.age=25;
        System.out.println(student.age);
        student.study();
        student.study(5);
        student.study("Erkin");
    }
}
