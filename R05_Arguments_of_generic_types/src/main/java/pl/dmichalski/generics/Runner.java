package pl.dmichalski.generics;

import java.util.Collections;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        new Runner();
    }

    public Runner() {
        Generics<String> stringGenerics = new Generics<>();
        stringGenerics.test("test");

        this.<String>wypisz("string");
        // this.<String>wypisz(4);         // it's not working

        List<String> strings = Collections.<String>emptyList();
    }

    public <T> void wypisz(T argument) {
        System.out.println(argument);
    }
}
