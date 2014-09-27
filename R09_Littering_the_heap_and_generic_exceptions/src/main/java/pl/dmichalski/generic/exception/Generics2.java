package pl.dmichalski.generic.exception;

/**
 * Author: Daniel
 */
public class Generics2 {

    public <E extends Exception> void method() throws E {

    }

    // it's not working
    /*
    public <E extends Exception> void method() {
        try {

        } catch (GenericException<A> a) {

        } catch (GenericException<B> b) {

        }
    }
    */

    // it's not working
    /*
    public <E extends Exception> void method() {
        try {

        } catch (E a) {

        } catch (Exception e) {

        }
    }
    */

}
