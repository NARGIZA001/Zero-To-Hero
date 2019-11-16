package CollectionPractice;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {

        Map mapList=new HashMap();

        Map <Integer,String> emplyeeList=new HashMap<>();

        emplyeeList.put(1234,"Nargiza");// how to store Map <key, value > employeeList
        emplyeeList.put(1235,"David");
        emplyeeList.put(1236,"Kushal");
        emplyeeList.put(1237,"Priyanka"); // can store same values but with different keys
        emplyeeList.put(1237,"New Value"); // can store same values but with different keys
                                            // if you leave the key and just change the value Map will automatically ressing the new value

        System.out.println(emplyeeList);

        HashMap<Integer,String > ticketMasterEmp=new HashMap<>();

        ticketMasterEmp.putAll(emplyeeList);

        System.out.println(ticketMasterEmp);

        // Get method . it will get the key as a parameter and it will return the value

        String empName =ticketMasterEmp.get(1234);

        System.out.println(ticketMasterEmp.get(1234));

        System.out.println(empName);

        ticketMasterEmp.remove(1236);

        System.out.println(ticketMasterEmp);

        // Method called key Set () it will return  Set of all the key from map.

        Set<Integer> empIds=ticketMasterEmp.keySet(); // using the keySet () method we can get the keys
                                                        // keySet () method return type is Set. That's why I can store a a Set.
                                                        // Create foreach loop
                                                        //using get() method from HashMapPractice I can give the keys
                                                        // it will get the values
        for (Integer id: empIds ) {
            System.out.println("Values of employee"+ticketMasterEmp.get(id));
        }


        for (Integer id: empIds ) {
            System.out.println("Values of employee "+ id);
        }






    }
}
