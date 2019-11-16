package ZIQ;

public class ArrayMaxNumber {

        public static void main(String[] args) {
            int[] arrMaxMin = {-6, -4, 9, 10};
            int sum = 0, countNe = 0, sumpos = 0, countpo = 0;
            for (int a = 0; a < arrMaxMin.length; a++) {
                if (arrMaxMin[a] < 0) {
                    sum = sum + arrMaxMin[a];
                    countNe++;
                } else {
                    sumpos = sumpos + arrMaxMin[a];
                    countpo++;
                }

            }

        }
    }