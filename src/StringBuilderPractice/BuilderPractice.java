package StringBuilderPractice;

public class BuilderPractice {

    public void StringBuilderCheck (StringBuilder builder) {

        StringBuilder rich = new StringBuilder();

       // StringBuilder dream = new StringBuilder();
        //StringBuilder play = new StringBuilder();

       for (int i=0; i<builder.length(); i++){

           char letter =builder.charAt(i);

           if (letter>='D' && letter<='G'){

               rich.append(letter);

           }
       }

       rich.replace(2,4,"SS");

        System.out.println(rich);
    }

    public static void main(String[] args) {

        BuilderPractice dream=new BuilderPractice();

        dream.StringBuilderCheck(new StringBuilder("GAMDKJDHO2UY658HFE7KN12BL39KGAEmmm"));


    }
}
