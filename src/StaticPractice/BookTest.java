package StaticPractice;

public class BookTest {
    public static void main(String[] args) {

        Book seven=new Book("Pillars",310);
        Book eight=new Book("Strategies",360);

        //Instance initialization block belongs to object.
        //Since count belongs to object . Count value will be 1 after code runs.

        System.out.println(seven.count);
        System.out.println(eight.count);

        //System.out.println(seven.author);
        //System.out.println(eight.author);
        //System.out.println(seven.kind);
        //System.out.println(eight.kind);


    }
}
