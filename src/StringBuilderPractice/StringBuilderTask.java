package StringBuilderPractice;

public class StringBuilderTask {

    public String function (String [] arr) {


        String name ="";

        for (String s:  arr){

            name+=s;
        }

        return name;
    }

    public static void main (String[] args) {

        StringBuilderTask pr= new StringBuilderTask();

        String [] string ={"tech", "2019", "coding"};

        System.out.println(pr.function(string));





    }

}
