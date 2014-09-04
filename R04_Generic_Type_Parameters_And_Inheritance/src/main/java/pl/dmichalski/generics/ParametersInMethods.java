package pl.dmichalski.generics;

import java.util.List;

/**
 * Author: Daniel
 */
public class ParametersInMethods {

    public static <T> T staticMethod(T argument) {
        List<T> list = null;
        T temp = null;

        class NestedClass {
            List<T> anotherList = null;

            public void test(T arg) {

            }
        }

        return argument;
    }

    public <T> T nonStaticMethod(T argument) {
        List<T> list = null;
        T temp = null;

        return argument;
    }

}
