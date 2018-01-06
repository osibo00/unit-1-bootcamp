/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {
        /**
         * question 7
         */
        printSumToN(10000);

    }

    /**
     * question 1
     */
    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * question 2
     */
    public static void printMoreNumbers() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * question 3
     *
     * @param n
     */
    public static void printToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    /**
     * question 4
     *
     * @param n
     */
    public static void printEvenToN(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * question 5
     */
    public static void printSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * question 6
     */
    public static void printSumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * question 8
     *
     * @param s
     * @param n
     */
    public static void printStringNTimes(String s, int n) {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.println(s);
            }
        } else {
            System.out.println("");
        }
    }

    /**
     * question 9
     *
     * @param s
     * @param n
     */
    public static void printStringConcatenatedNTimes(String s, int n) {
        String newString = "";
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                newString += s;
            }
        } else {
            System.out.println("");
        }
        System.out.println(newString);
    }

    /**
     * question 10
     */
    public static void printFibonacciToTen() {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for (int i = 2; i < 10; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

    /**
     * question 11
     */
    public static void printFibonacciSumToTen() {
        int n1 = 0;
        int n2 = 1;
        int sum = n2;
        for (int i = 2; i < 10; i++) {
            int n3 = n1 + n2;
            sum += n3;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sum);
    }

    /**
     * question 12
     */
    public static void printFibonacciSumToN(int n) {
        int n1 = 0;
        int n2 = 1;
        int sum = n2;
        for (int i = 2; i < n; i++) {
            int n3 = n1 + n2;
            sum += n3;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sum);
    }

    /**
     * Exercises++
     * question 1
     */
    public static int sumNumbers(String s) {
        int sum = 0;
        String[] splitter = s.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
        for (int i = 0; i < splitter.length; i++) {
            if (splitter[i].matches("[-+]?\\d*\\.?\\d+")) {
                sum += Integer.parseInt(splitter[i]);
            }
        }
        return sum;
    }

    /**
     * question 2
     *
     * @param s
     * @return
     */

    public static String notReplace(String s) {
        String[] splitter = s.split(" ");
        for (int i = 0; i < splitter.length; i++) {
            StringBuilder sb = new StringBuilder(splitter[i]);
            if (splitter[i].contains("is")) {
                if (splitter[i].length() > 2) {
                    int length = splitter[i].length();
                    for (int n = 0; n < length; n++) {
                        String character = Character.toString(splitter[i].charAt(n));
                        if (!character.matches(".*[a-z].*")) {
                            String appended = sb.insert(n, " not").toString();
                            splitter[i] = appended;
                        }
                    }
                    String appended = sb.append(" not").toString();
                    splitter[i] = appended;
                } else {
                    String appended = sb.append(" not").toString();
                    splitter[i] = appended;
                }
            }
        }
        String newString = "";
        for (int i = 0; i < splitter.length; i++) {
            newString += splitter[i] + " ";
        }
        return newString;
    }

    /**
     * question 3
     *
     * @param s
     * @param words
     * @return
     */
    public static String wordEnds(String s, String words) {
        int size = words.length();
        int index = s.indexOf(words);
        String newString = "";
        while (index >= 0) {
            try {
                newString += s.charAt(index - 1);
            } catch (IndexOutOfBoundsException e) {
            }
            try {
                newString += s.charAt(index + size);
            } catch (IndexOutOfBoundsException e) {
            }
            index = s.indexOf(words, index + size);
        }
        return newString;
    }

    /**
     * question 4
     *
     * @return
     */
    public static List<String> numberPuzzle() {
        List<String> integerPairs = new ArrayList<>();
        for (int i = 10; i < 100; i++) {
            for (int n = 10; n < 100; n++) {
                if (i + n == 60) {
                    if ((i - n == 14) || (n - i == 14)) {
                        String pair = String.valueOf(i) + " " + String.valueOf(n);
                        integerPairs.add(pair);
                    }
                }
            }
        }
        return integerPairs;
    }

    /**
     * question 5
     *
     * @return
     */
    public static List<String> digits() {
        List<String> integerList = new ArrayList<>();
        String equation = "";
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            String numberString = String.valueOf(i);
            equation += numberString + ", ";
            char[] digit = numberString.toCharArray();
            for (int n = 0; n < digit.length; n++) {
                String value = Character.toString(digit[n]);
                sum += Character.getNumericValue(digit[n]);
                if (n == digit.length - 1) {
                    equation += value + " = ";
                } else {
                    equation += value + "+";
                }
            }
            equation += sum;
            integerList.add(equation);
            equation = "";
            sum = 0;
        }
        return integerList;
    }
}
