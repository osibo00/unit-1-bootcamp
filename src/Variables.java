/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

    public static void main(String args[]) {

    }

    /**
     * question 1
     *
     * @param n
     * @return
     */
    public static boolean isOdd(int n) {
        return !(n % 2 == 0);
    }

    /**
     * question 2
     */
    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }

    /**
     * question 3
     *
     * @param i
     * @param n
     * @return
     */
    public static int greatestCommonFactor(int i, int n) {
        int max = Math.max(i, n);
        int min = Math.min(i, n);
        int minNumber = Math.min(i, n);
        while (1 < minNumber) {
            if (max % minNumber == 0) {
                if (min % minNumber == 0) {
                    return minNumber;
                }
            }
            minNumber--;
        }
        return 1;
    }
}
