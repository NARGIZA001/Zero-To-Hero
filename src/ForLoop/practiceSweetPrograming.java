package ForLoop;

public class practiceSweetPrograming {
    public static void main(String[] args) {
        boolean additionalInfo=false; //this means don't print additional login ==true
        for (int i=9; i>=0; i--){
            System.out.println(i);

            if (i==5){
                if (additionalInfo==true ) {
                    System.out.println("We 5 found");
                }
            }
        }
    }
}
