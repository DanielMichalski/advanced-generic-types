package pl.dmichalski.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class WildcardsTest {

    public static void main(String[] args) {
        new WildcardsTest();
    }

    public WildcardsTest() {
        sizeOfAnyList(new ArrayList<String>());
        sizeOfAnyList(new ArrayList<Number>());

        sizeOfNumbersList(new ArrayList<Number>());
        // sizeOfNumbersList(new ArrayList<String>();    // it's not working

        sizeOfList(new ArrayList<Number>());
        // sizeOfList(new ArrayList<String>());     // it's not working
    }

    public int sizeOfAnyList(List<?> list) {
        return list.size();
    }

    public int sizeOfNumbersList(List<? extends Number> list) {
        return list.size();
    }

    public int sizeOfList(List<? super Number> list) {
        return list.size();
    }
}
