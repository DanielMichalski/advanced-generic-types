package pl.dmichalski.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class GenericListsTest {

    public GenericListsTest() {
        List<List<?>> list = new ArrayList<>();

        list.add(new ArrayList<String>());
        list.add(new ArrayList<Integer>());

        List<? extends List<?>> list2 = new ArrayList<>();
        // list2.add(new ArrayList<Object>());     // it's not working

        List<List<?>> reference1;
        List<? extends List<?>> reference2;

        reference1 = list;
        // reference1 = list2;      // it's not working

        reference2 = list;
        reference2 = list2;
    }

}
