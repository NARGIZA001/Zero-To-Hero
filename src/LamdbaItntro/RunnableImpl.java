package LamdbaItntro;

public class RunnableImpl {


    public static void main(String[] args) {

        Thread myThread = new Thread(() -> System.out.println("From lamda class"));



        myThread.run();



    }


}
