package ZIQ;

import java.util.HashMap;
import java.util.Map;

public class LetterCountMap {


    /////////// # 1 method    just String  (String str)

    public static void getLetter(String str){

        Map<Character, Integer> letters = new HashMap<>();

        str=str.toLowerCase();

        for (int i=0; i< str.length(); i++){
            char ch=str.charAt(i);

            if (letters.containsKey(ch)){
                int count =letters.get(ch);
                letters.replace(ch,++count);
            }else{
                letters.put(ch,1);
            }
        }
        System.out.println(letters);


    }


    ////////////// # 2 method with Array     (String[] strings)


    public static  Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer>map=new HashMap<>();
        for(int i=0; i<strings.length; i++){
            String word = strings[i];
            if (map.containsKey(word)){
                int count=map.get(word);
                map.put(word, count+1);    // or you can do ++count;
            }else{
                map.put(word,1);
            }
        }
        return map;

    }
    public static void main(String[] args) {

        getLetter("NargizA");






    }


}
