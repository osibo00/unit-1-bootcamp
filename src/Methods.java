/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {

    }

    /**
     * question 1
     *
     * @param n
     * @return
     */
    public static int calculateSquare(int n) {
        return n * n;
    }

    /**
     * question 2
     *
     * @param n
     * @return
     */
    public static double calculateSquareRoot(int n) {
        return Math.sqrt(n);
    }

    /**
     * question 3
     *
     * @param s
     * @return
     */
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    /**
     * question 4
     *
     * @param i
     * @param n
     * @return
     */
    public static boolean isMultiple(int i, int n) {
        return (n % i == 0);
    }

    /**
     * question 5
     *
     * @param n
     */
    public static void prettyInteger(int n) {
        String star = "";
        for (int i = 1; i <= n; i++) {
            star += "*";
        }
        System.out.println(star + " " + n + " " + star);
    }

    /**
     * question 6
     *
     * @param i
     * @param n
     * @return
     */
    public static int random(int i, int n) {
        return ThreadLocalRandom.current().nextInt(i, n + 1);
    }
}


