package pl.dmichalski.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class ErasingTypesInfo {

    private static List<String> list = new ArrayList<String>();

    private static List list2 = new ArrayList<String>();

    private static List list3 = new ArrayList();

    private static ArrayList<String> list4 = new ArrayList<String>();

    public static void main(String[] args) {
        Class<?> aClass1 = list.getClass();
        System.out.println(aClass1);

        Class<?> aClass2 = list.getClass();
        System.out.println(aClass2);

        Class<?> aClass3 = list.getClass();
        System.out.println(aClass3);

        Class<?> aClass4 = list.getClass();
        System.out.println(aClass4);
    }
}
