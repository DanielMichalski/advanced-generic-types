package pl.dmichalski.generic.animals;

/**
 * Author: Daniel
 */
public class Dog extends Animal {  // implements Comparable<Dog> // it's not working

    private String name;

    public Dog(Integer age, String name) {
        super(age);
        this.name = name;
    }

    // it's not working
    /*
    @Override
    public int compareTo(Dog o) {
        return 0;
    }
    */
}
