/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {

    }

    /**
     * question 1
     */
    Cat garfield = new Cat();
        garfield.setName("Garfield");
        garfield.setFavoriteFood("Lasagna");
        garfield.setAge(10);

    Cat pinkPanther = new Cat();
        pinkPanther.setName("Pink Panther");
        pinkPanther.setFavoriteFood("Pizza");
        pinkPanther.setAge(4);

    Cat catWoman = new Cat();
        catWoman.setName("Catwoman");
        catWoman.setFavoriteFood("Cereal");
        catWoman.setAge(44);

    Cat sheev = new Cat();
        sheev.setName("Palpatine");
        sheev.setFavoriteFood("Pasta");
        sheev.setAge(66);

    Cat manCat = new Cat();
        manCat.setName("Mancat");
        manCat.setFavoriteFood("Milk");
        manCat.setAge(11);

    ArrayList<Cat> cats = new ArrayList<>();
        cats.add(garfield);
        cats.add(pinkPanther);
        cats.add(catWoman);
        cats.add(sheev);
        cats.add(manCat);

        for(
    Cat cat :cats)

    {
        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getFavoriteFood());
    }

    /**
     * question 3
     */
    HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Darnell",25);
        hashMap.put("Amy",26);
        hashMap.put("Francesco",27);
        hashMap.put("Anne",28);
        hashMap.put("Wayne",29);

        for(
    String coder :hashMap.keySet())

    {
        System.out.println(coder + " " + hashMap.get(coder));
    }


}

    /**
     * question 2
     *
     * @param integers
     */
    public static void mostFrequentElement(ArrayList<Integer> integers) {
        int mostFrequent = 0;
        int counter = 0;
        int savedCounter = 1;
        for (Integer integer : integers) {
            for (int i = 0; i < integers.size() - 1; i++) {
                if (integers.get(i).equals(integer)) {
                    counter++;
                }
            }
            if (counter >= 2) {
                if (counter > savedCounter) {
                    savedCounter = counter;
                    mostFrequent = integer;
                    counter = 0;
                }
            } else {
                counter = 0;
            }
        }
        if (savedCounter > 1) {
            System.out.println("Most frequent element: " + mostFrequent + " with " + savedCounter + " occurrences");
        } else {
            System.out.println("Only one occurrence per integer.");
        }
    }
    /**
     * bonus for question 2
     */
//    public static void mostFrequentElement(ArrayList<String> strings) {
//        String mostFrequent = "";
//        int counter = 0;
//        int savedCounter = 1;
//        for (String s : strings) {
//            for (int i = 0; i < strings.size()-1; i++) {
//                if (strings.get(i).equals(s)) {
//                    counter++;
//                }
//            }
//            if (counter >= 2) {
//                if (counter > savedCounter) {
//                    savedCounter = counter;
//                    mostFrequent = s;
//                    counter = 0;
//                }
//            } else {
//                counter = 0;
//            }
//        }
//        if (savedCounter > 1) {
//            System.out.println("Most frequent element: " + mostFrequent + " with " + savedCounter + " occurrences");
//        } else {
//            System.out.println("Only one occurrence per string.");
//        }
//    }

    /**
     * question 4
     */
    public static boolean canRentACar(HashMap<String, Integer> hashMap) {
        for (String coder : hashMap.keySet()) {
            if (hashMap.get(coder) > 25) {
                return true;
            }
        }
        return false;
    }

    /**
     * question 5
     */
    public static ArrayList<String> wordsWithoutList(ArrayList<String> strings, int l) {
        ArrayList<String> newStrings = new ArrayList<>();
        for (String s : strings) {
            if (s.length() != l) {
                newStrings.add(s);
            }
        }
        return newStrings;
    }

    /**
     * question 6
     *
     * @param integers
     * @return
     */

    public static int countClumps(ArrayList<Integer> integers) {
        int counter = 0;
        boolean isFirstElement = true;
        int previous;
        for (int i = 0; i < integers.size() - 1; i++) {
            if (isFirstElement) {
                previous = integers.get(i);
                if (previous == integers.get(i + 1)) {
                    counter++;
                }
            } else {
                previous = integers.get(i - 1);
                if (previous != integers.get(i)) {
                    if (integers.get(i).equals(integers.get(i + 1))) {
                        counter++;
                    }
                }
            }
            isFirstElement = false;
        }
        return counter;
    }

    /**
     * question 7
     *
     * @param s
     * @return
     */
    public static ArrayList<String> breakUpStrings(String s) {
        String[] splitter = s.split(" ");
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < splitter.length; i++) {
            strings.add(splitter[i]);
        }
        Collections.sort(strings);
        return strings;
    }

}
