package pl.dmichalski.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class Generics {

    public void method() {
        List<String> list = new ArrayList<>();
        List list2 = list;

        List<Integer> list3 = list2;
        list3.add(5);
    }
}
