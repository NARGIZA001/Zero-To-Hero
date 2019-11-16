package LamdbaItntro;

public class Greeting {


    private static void somemethod(String str){

        System.out.println(str);

    }
    public static void main(String[] args) {
        Greeter myFunction = (String txt) -> System.out.print("Hello "+ txt);
        myFunction.hello("Temirlan");
        String str = "adlfkj";

        goodMethod((String txt) -> System.out.print("Hello "+ txt));
    }


    public static void goodMethod(Greeter greeter){

    }





}
