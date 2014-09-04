package pl.dmichalski.generics.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        new Runner();
    }

    public Runner() {
        List<String> genericCollection = genericColection();
        List nonGenericColection = nonGenericColection();

        dangerModification(genericCollection);
    }

    private List<String> genericColection() {
        List<String> genericList = new ArrayList<>();

        genericList.add("one");
        genericList.add("two");
        genericList.add("three");

        for (String s : genericList) {
            System.out.println(s);
        }

        return genericList;
    }

    private List nonGenericColection() {
        List nonGenericList = new ArrayList();

        nonGenericList.add("one");
        nonGenericList.add(2);
        nonGenericList.add(new Object());

        for (Object o : nonGenericList) {
            System.out.println(o);
        }

        return nonGenericList;
    }

    private void dangerModification(List list) {
        list.add(1);   // This is not what we want
    }
}
