package StringBuilderPractice;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder table=new StringBuilder();//StringBuilder is an object ;

        StringBuilder table1=new StringBuilder("Rockwell");

        System.out.println(table);

        table.append("ikaea");

        //Dynamic Polymorphism java will call the appropriate method even if you choose the append(int). polymorphism corrects it by itself.

        System.out.println(table);

        table.append(10);

        System.out.println(table);

        String name ="ikea";

        name.concat("10");

        System.out.println(name);

        table1.append(10.4);

        System.out.println(table);

        new StringBuilder().append("tech"); // anonymous object because i can't call this again it goes to GARBAGE COLLECTION.

        System.out.println("Tech".charAt(0));

        StringBuilder computer =new StringBuilder();

        for (char i='a'; i<='z'; i++){
            computer.append(i + " ");
        }
        System.out.println(computer);

        StringBuilder success1= new StringBuilder("Working Hard ");

        success1.append("does not makes you successful.");

        System.out.println(success1);

        StringBuilder thruth=success1.append("Thinking hard makes you successful");

        System.out.println(thruth);

        System.out.println(success1);

        StringBuilder success2=new StringBuilder(" Tech "); //

        success2.append(" torial ");

        StringBuilder truth1=success2.append(" 2019 ");

        System.out.println(success2);

        System.out.println(truth1);

        truth1=truth1.append("Best ").append(" Summer ");

        System.out.println(truth1);

        success2.append(success2);

        System.out.println(success2);

        System.out.println(truth1);

        StringBuilder tree=new StringBuilder("Oak");

        StringBuilder tree1=new StringBuilder("Oak ").append("14");

        System.out.println(tree);
        System.out.println(tree1);

        char nm=tree.charAt(0); // -> char

        System.out.println(nm); //O

        System.out.println(tree); //Oak

        // when call the method and return type is StringBuilder, in this your original StringBuilder value will change.
        // .append()= tree .indexOf("k");

        int index=tree.indexOf("ak"); //1 if you give more than one character it will return only the first character from the string "Oak"

        System.out.println(index);

        int lenght=tree.length();
        System.out.println(lenght);

        String subs=tree.substring(1);

        System.out.println(tree);
        System.out.println(subs);

        String tr=tree1.append("10  ").append(true).substring(5).substring(1); //since substring is String you can not continue append things

        tree1.append('K').append(6.4);

        System.out.println(tree1);

        System.out.println(tr);

        StringBuilder apple=new StringBuilder("Aple");

        apple.insert(1, "p");

        System.out.println(apple); // Apple

        apple.insert(5,'s');

        System.out.println(apple);

        apple.insert(5, 5);

        System.out.println(apple);

        StringBuilder [] builder ={tree, tree1, computer, apple};


        for (int i=0; i<builder.length; i++){

            builder[i].insert(2,"-");

        }
        System.out.println(Arrays.toString(builder));
    }
}
