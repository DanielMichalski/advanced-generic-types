package pl.dmichalski.generics.comparable;

/**
 * Author: Daniel
 */
public class Dog implements Comparable<Dog> {

    private Integer age;

    public Dog(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog other) {
        return age.compareTo(other.age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
