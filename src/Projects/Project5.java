package Projects;
import java.util.Arrays;
import java.util.Map;


public class Project5 {
    public static void main(String[] args) {


    }

    public boolean endOther(String a, String b) {

        for (int i=0; i<a.length(); i++){

            for(int j=0; j<b.length(); j++){

                if (a.charAt(i)==b.charAt(j)){
                    return true;
                }
            }

        }
        return false;
    }

    public boolean xyzThere(String str) {
        if (str.length() >= 3) {
            if (str.substring(0,3).equals("xyz")) return true;
            for (int i = 0; i < str.length()-3; i++)
                if (str.substring(i+1, i+4).equals("xyz") &&
                        str.charAt(i) != '.')
                    return true;

        }
        return false;
    }

    public String mixString(String a, String b) {

        StringBuilder stbuild=new StringBuilder (a.length()+b.length());
        String res="";

        for (int i=0; i<stbuild.length(); i++ ){
            stbuild.append(a.charAt(i));
            for (int j=0; j<b.length(); j++){
                stbuild.append(b.charAt(j));


            }
        }

        return stbuild.toString();

    }

    public Map<String, String> mapAB2(Map<String, String> map) {

        if (map.containsKey ("a") && map.containsKey ("b")){
            if ( map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove ("b");
            }
        }

        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {

        if (map.containsKey ("a") && !map.containsKey("b")){
            map.put("b", map.get("a"));
        }
        if (map.containsKey("b") && !map.containsKey("a")){
            map.put("a", map.get("b"));
        }

        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {

          //if (map.get("a").length() == map.get("b").length()){
           // map.put("a", "");
           // map.put("b", "");


        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if      (a.length() > b.length()) map.put("c", a);
            else if (b.length() > a.length()) map.put("c", b);
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }


    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice creame")){
            map.put("yourgurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }

        return map;
    }





}
