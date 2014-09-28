package pl.dmichalski.generics;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class Generics {

    private static List<String> list = new ArrayList<String>();

    private static String string = "aha";

    public static void main(String[] args) throws NoSuchFieldException {
        checkGeneric();
        checkParametrized();
    }

    private static void checkGeneric() {
        Class<?> aClass = list.getClass();
        TypeVariable<?>[] typeParameters = aClass.getTypeParameters();

        if (typeParameters != null && typeParameters.length > 0) {
            System.out.println("Selected type is a generic type");
        } else {
            System.out.println("Selected type isn't a generic type");
        }
    }

    private static void checkParametrized() throws NoSuchFieldException {
        Field field = Generics.class.getDeclaredField("list");
        Type genericType = field.getGenericType();

        if (genericType instanceof ParameterizedType) {
            System.out.println("This is a parametrized type");
        } else {
            System.out.println("This isn't a parametrized type");
        }
    }

}
