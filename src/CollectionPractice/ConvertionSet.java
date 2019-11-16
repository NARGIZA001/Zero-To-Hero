package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertionSet {
    public static void main(String[] args) {

        ArrayList<String> singerList= new ArrayList<>();

        singerList.add("Drake");
        singerList.add("Jackson");
        singerList.add("Cardy B");
        singerList.add("Beonce");
        singerList.add("Drake");

        System.out.println("This is ArrayLIst"+ singerList);


        HashSet<String> singerList1=new HashSet<>(singerList); // converting from ArrayList to Set ;

        System.out.println(" This is Set "+ singerList1);



        ArrayList listname= new ArrayList(singerList1); // converting from Set to Arraylist;

        System.out.println(" This is Arraylist "  + listname);




        singerList=new ArrayList<>(singerList); // diffrenet way of converting from Set to ArrayList which is original;

        System.out.println("The second convertion from ArrayList  " + singerList );





    }
}
