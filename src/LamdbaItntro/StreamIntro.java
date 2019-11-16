package LamdbaItntro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamIntro {


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("cherry");
        stringList.add("pineapple");

//        Predicate predicate = (Object s) -> {
//            if(s.equals("")){
//              return false;
//            };
//            return true;
//        };
        stringList.stream().filter((String o) -> o.startsWith("a")).forEach((String f) -> System.out.println(f));

        //or

        for (int i =0;i<stringList.size();i++){
            if (stringList.get(i).startsWith("a"))
            System.out.println(stringList.get(i));
        }

    }


}
