package LamdbaItntro;

import java.util.Arrays;
import java.util.List;

public class StreamTask {


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


        list.stream().filter((String r) -> r.length()>5).sorted().map(m->m+", size: "+m.length()).forEach(f-> System.out.println(f));
    }
}
