package pl.dmichalski.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        new Runner();
    }

    public Runner() {
        WildcardTest wildcardTest = new WildcardTest();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        System.out.println(Arrays.toString(numbers.toArray()));
        System.out.println("Sum: " + wildcardTest.sum(numbers));
        System.out.println("Middle element: " + wildcardTest.getMiddleElement(numbers));
        System.out.print("Printing object: ");
        wildcardTest.print(numbers);

        wildcardTest.reverse(numbers);
        System.out.println("Reverted list " + Arrays.toString(numbers.toArray()));

        System.out.println("Sum two firs numbeers: " + wildcardTest.sumTwoFirstNumbers(numbers));
    }
}
