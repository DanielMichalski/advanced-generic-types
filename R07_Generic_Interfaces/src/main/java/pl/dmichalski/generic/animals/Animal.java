package pl.dmichalski.generic.animals;

/**
 * Author: Daniel
 */
public class Animal implements Comparable<Animal> {

    private Integer age;

    public Animal(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Animal other) {
        return age.compareTo(other.age);
    }

}
