package pl.dmichalski.generic.animals;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat(10, "Johny");
        Dog dog = new Dog(5, "Jack");

        System.out.println(cat.compareTo(dog));
        System.out.println(dog.compareTo(cat));
    }
}
