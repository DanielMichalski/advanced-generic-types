package pl.dmichalski.generics;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class FieldTypes {

    private static List<String> list = new ArrayList<>();

    private static List list2 = new ArrayList();

    public static void main(String[] args) throws NoSuchFieldException {
        Field field1 = FieldTypes.class.getDeclaredField("list");
        Type type = field1.getGenericType();
        System.out.println(type);

        Field field2 = FieldTypes.class.getDeclaredField("list2");
        Type type2 = field2.getGenericType();
        System.out.println(type2);
    }
}
