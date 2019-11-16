package InharitanceOOP3;

public class testStatic {
    public static void main(String[] args) {
        example ex=new example();


        System.out.println("+++++++++++++");

        example ex1=new example(); // only instance blocks will be executed because static executes only one time and in the very begining

    }
}
