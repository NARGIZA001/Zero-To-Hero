package LamdbaItntro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamIntExample {


    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "a;lfj",
                "a;ldkfj;fjk",
                "oieriejkdagadkfj",
                "oieriejkdagadkfj",
                "oieriejkdagadkfj",
                "oieriejkdagadkfj",
                "oieriejkdagadkfj",
                "oieriejkdagadkfj",
                "oieriejkdagadkfj",
                "oieriejkdagadkfj",
                "adf",
                "3434"
        );


        List<String> list1
                = list.stream().filter(f -> f.length() > 3).collect(Collectors.toList());

        String strinsg=list.stream().filter(f -> f.length() < 9
        ).collect(Collectors.joining(": "));
        System.out.println(strinsg);


//        System.out.println(IntStream.range(1, 10).average());
    }
}
