package pl.dmichalski.generics.interfaces2;

/**
 * Author: Daniel
 */
public class Generics implements InterfaceA<Integer>, InterfaceB<Float> {

    @Override
    public void method(Integer argument) {
        System.out.println("Method with Integer");
    }

    @Override
    public void method(Float argument) {
        System.out.println("Method with Float");
    }
}
