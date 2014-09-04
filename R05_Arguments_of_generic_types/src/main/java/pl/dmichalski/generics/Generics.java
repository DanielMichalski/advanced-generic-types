package pl.dmichalski.generics;

import java.util.Map;

/**
 * Author: Daniel
 */
public class Generics<K> {

    public <V> void test(V v) {
        Map<K, V> map = null;
    }

}
