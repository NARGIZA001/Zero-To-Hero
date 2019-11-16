package LamdbaItntro;

import java.util.ArrayList;
import java.util.List;

public class StreamIntro2 {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(9879);
        integers.add(342);
        integers.add(5454);
        integers.add(563);
        integers.add(66);
        integers.add(0);
        integers.add(2343);


        integers.stream().filter((Integer i) -> i % 2 == 0).map(m -> m + ": is even").forEach(e -> System.out.println(e));

    }
}
