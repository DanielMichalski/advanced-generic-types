package pl.dmichalski.generics;

import java.util.ArrayList;

/**
 * Author: Daniel
 */
public class Generics {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = createObj(ArrayList.class);
        ArrayList<Number> list2 = createObj(ArrayList.class);
        String string = createObj(String.class);
    }

    // it isn't working
    /*
    private static <T> T createObj() {
        return new ArrayList<T>();
    }
    */

    // it isn't the best way
    /*
    private static <T> T createObj(T obj) throws IllegalAccessException, InstantiationException {
        return (T) obj.getClass().newInstance();
    }
    */

    private static <T> T createObj(Class<T> type) throws Exception {
        return type.newInstance();
    }

    private static <T> T checkAndCreateObj(Object obj, Class<T> type) throws Exception {
        if (type.isInstance(obj)) {
            return (T) obj;
        }

        return type.newInstance();
    }
}
