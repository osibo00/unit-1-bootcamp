/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {

        // question 1
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
    }

    // question 2
    public static boolean isOlder(Cat catOne, Cat catTwo) {
        return (catOne.getAge() > catTwo.getAge());
    }

    // question 3
    public static void makeBestFriends(Cat catOne, Cat catTwo) {
        catOne.setFavoriteFood(catTwo.getFavoriteFood());
    }

    // question 4
    public static String makeKitten(Cat catOne, Cat catTwo) {
        return catOne.getName() + catTwo.getName();
    }

    // question 5
    public static void adoption(Cat cat, Person person) {
        cat.setOwner(person);
    }

    // bonus
    public static void flyFree(Cat cat, Person person) {
        if (cat.getName().equals("Catwoman")) {
            System.out.println("Catwoman will never be anyone's pet!");
        } else {
            cat.setOwner(person);
        }
    }

    // question 6
    public static boolean isFree(Cat cat) {
        return (cat.getOwner() == null);
    }

    // question 7
    public static boolean isSibling(Cat catOne, Cat catTwo) {
        return (catOne.getOwner() == catTwo.getOwner());
    }
}
