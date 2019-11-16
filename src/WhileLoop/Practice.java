package WhileLoop;

public class Practice {
    public static void main(String[] args) {

        int roomInBelly=5;
        int bitesOfCheese=10;

        while (bitesOfCheese > 0 && roomInBelly > 0 ){
            bitesOfCheese--;
            roomInBelly--;
        }

        System.out.println(bitesOfCheese + " left");

    }
}
