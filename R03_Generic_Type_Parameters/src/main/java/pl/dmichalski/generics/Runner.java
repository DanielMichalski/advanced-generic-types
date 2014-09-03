package pl.dmichalski.generics;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        new Runner();
    }

    public Runner() {
        RandomSortableList<Integer> list = new RandomSortableList<>();

        list.add(7);
        list.add(3);
        list.add(5);

        System.out.println("List: " + list);

        Integer randomElement = list.getRandomElement();
        System.out.println("Random element: " + randomElement);

        list.sort();
        System.out.println("After sorting: " + list);
    }
}
