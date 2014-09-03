package generics;

/**
 * Author: Daniel
 */
public class ParametersInClasses<T> {

    private T first = null;

    private T second = null;

    {
        T temp = null;
    }

    class NestedClass {
        private T nested = null;

        public T secondMethod(T secondArgument) {
            return secondArgument;
        }
    }

    public T method(T argument) {
        return argument;
    }

    // it's not working
    /*
    private static T third = null;

    static {
        T temp = null;
    }

    public static T staticMethod(T argument) {
        return argument;
    }

    public static class NestedStaticClass {
        public T propertyInside = null;
    }

    enum EnumType {
        ONE,
        TWO

        public void check(T argument) {
        }
    }
    */
}
