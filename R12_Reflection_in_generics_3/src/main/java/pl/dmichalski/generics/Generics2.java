package pl.dmichalski.generics;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Author: Daniel
 */
public class Generics2<E> {

    public E field;

    public <K, V> E genericMethod() {
        return field;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Generics2.class.getMethod("genericMethod");
        Type returnType = method.getGenericReturnType();
        System.out.println("returned type: " + returnType);
        System.out.println("method.toString(): " + method.toString());
        System.out.println("method.toGenericString(): " + method.toGenericString());

        System.out.print("Method type parameters: ");
        TypeVariable[] typeParameters = method.getTypeParameters();
        for (TypeVariable parameters : typeParameters) {
            System.out.print(parameters + " ");
        }
        System.out.println();

        Generics2<Integer> obj = new Generics2<>();
        Class<?> aClass = obj.getClass();
        for (TypeVariable<?> typeVariable : aClass.getTypeParameters()) {
            System.out.println(typeVariable.getName());
            System.out.println(typeVariable.getGenericDeclaration());
        }
    }

}
