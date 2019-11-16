package CollectionPractice;

import java.util.Hashtable;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {

        TreeMap <String, String > phoneList=new TreeMap<>();

        phoneList.put("MOM", "123456789");
        phoneList.put("DAD", "223456789");
        phoneList.put("BRO", "323456789");
        phoneList.put("SIS", "423456789");
        phoneList.put("BRO", "323456789");
        phoneList.put("SIt", null);


        System.out.println(phoneList);

        Hashtable<Integer, Boolean> thruthList=new Hashtable<>();

        thruthList.put(123,false);
        thruthList.put(223,true);
        thruthList.put(323,false);
        thruthList.put(423,true);
        thruthList.put(423,false);

        //thruthList.put(null,null);

        System.out.println(thruthList);
    }
}
