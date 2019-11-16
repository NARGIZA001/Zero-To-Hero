package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Camel {

    public static void onlyCamNames (Map<String,String> list){     // list is your Map name

        Set<String > camel=list.keySet();

        for (String c: camel ) {

            if (c.startsWith("1")){

                System.out.println(list.get(c));
            }

        }


    }

    public static void main(String[] args) {

        Map<String,String> CamelList=new HashMap<>();

        CamelList.put("12345K","Camel1");
        CamelList.put("22345P","Camel2");
        CamelList.put("11345C","Camel3");
        CamelList.put("33345T","Camel4");
        CamelList.put("14345M","Camel5");


        System.out.println(CamelList);

        onlyCamNames(CamelList);

        System.out.println(CamelList.entrySet());

        //CamelList.clear(); // clear method will clear everything in the list

        System.out.println(CamelList.containsValue("Camel4"));
        // this method will return only true or false

        System.out.println(CamelList.containsKey("1434s5M")); // false because it is not available
        // this method returns true or false if the key is found


        HashMap<String, String> camelList2=new HashMap<>(CamelList);

        System.out.println(camelList2);

        System.out.println(CamelList.equals(camelList2));

        camelList2.isEmpty();

        CamelList.replace("22345P", "babyCamel");

        System.out.println(CamelList);







    }
}
