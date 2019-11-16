package MethodsPractice;

public class GetGreatest {
    // create method that will accept three int numbers
    // and this method will return the greates number as a int

    public int GetGreatest (int a, int b, int c){
        if (a>=b && a>=c){
            return a;
        }else if(b>=a && b>=c){
            return b;
        }else if (c>=a && c>=b){
            return c;
        }else{
            return -1;
        }

    }
}
