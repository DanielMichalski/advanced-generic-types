package pl.dmichalski.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Daniel
 */
public class Generics<E> {

    private E field;

    public E method(E arg) {
        return arg;
    }

    public void method2() {
        List<String> list = new ArrayList<>();
        List<?> list2 = Collections.<String>emptyList();
        Comparable<String> obj = "aha";
    }
}
