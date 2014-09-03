package pl.dmichalski.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Author: Daniel
 */
public class RandomSortableList<T extends Comparable> {

    private List<T> list;

    private Random random;

    public RandomSortableList() {
        list = new ArrayList<>();
        random = new Random();
    }

    public void add(T element) {
        list.add(element);
    }

    public T getRandomElement() {
        int sizeOfList = list.size();
        int randomIndex = random.nextInt(sizeOfList);
        return list.get(randomIndex);
    }

    public void sort() {
        Collections.sort(list);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
