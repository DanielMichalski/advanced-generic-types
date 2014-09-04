package pl.dmichalski.generics.comparable;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        Comparable dog1 = new Dog(4);
        Dog dog2 = new Dog(5);
        String dog3 = "Bad dog";

        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println(dog1.compareTo(dog2));
        // System.out.println(dog1.compareTo(dog3));   // This isn't what you want

    }

}
