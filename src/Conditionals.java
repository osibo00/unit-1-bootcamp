/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {

    }

    // question 1
    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }

    // question 2
    public static boolean isMultipleOfThree(int n) {
        return (n % 3 == 0);
    }

    // question 3
    public static boolean isOddAndIsMultipleOfThree(int n) {
        return ((n % 2 != 0) && (n % 3 == 0));
    }

    // question 4
    public static boolean isOddAndIsMultipleOfThree2(int n) {
        return (isOdd(n) && isMultipleOfThree(n));
    }

    // question 5
    public static void fizzMultipleOfThree(int n) {
        if (n % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    // question 6
    public static boolean fromLondon(Person person) {
        return person.getCity().equals("London");
    }

    // question 7
    public static void tooShort(Person person) {
        if (person.getName().length() > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }

    // Exercises++
    // question 1
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && (cigars >= 40)) {
            return true;
        } else if (!isWeekend && (cigars >= 40) && (cigars <= 60)) {
            return true;
        }
        return false;
    }

    // question 2
    public static int speedingTicket(int speed, boolean isBirthday) {
        int speedLimit = 60;
        if (isBirthday) {
            speedLimit = 65;
            if (speed >= 86) {
                return 2;
            }
        }
        if (speed <= speedLimit) {
            return 0;
        } else if ((speed > speedLimit) && (speed <= 80)) {
            return 1;
        } else {
            return 2;
        }
    }

    // question 3
    public static String alarmClock(int day, boolean onVacation) {
        if (onVacation) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else if (day == 0 || day == 6) {
            return "10:00";
        } else {
            return "07:00";
        }
    }

    // question 4
    public static int lotteryTicket(int a, int b, int c) {
        if (a == b && a == c) {
            return 20;
        } else if (a != b && b != c) {
            return 0;
        } else {
            return 10;
        }
    }

    //question 5
    public static int blackjack(int a, int b) {
        if (a > b && a <= 21) {
            return a;
        } else if (b > a && b <= 21) {
            return b;
        } else if (a > 21 && b > 21) {
            return 0;
        } else if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // question 6
    public static boolean evenlySpaced(int a, int b, int c) {
        int largerAB = Math.max(a, b);
        int smallerAB = Math.min(a, b);

        int extraMedium = Math.min(largerAB, c);
        int large = Math.max(largerAB, c);

        int medium = Math.max(smallerAB, extraMedium);
        int small = Math.min(smallerAB, extraMedium);

        int firstDifference = large - medium;
        int secondDifference = medium - small;
        return firstDifference == secondDifference;
    }
}
