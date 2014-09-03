package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Daniel
 */
public class WildcardsTest {

    public static void main(String[] args) {
        new WildcardsTest();
    }

    public WildcardsTest() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        System.out.println(Arrays.toString(numbers.toArray()));
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Middle element: " + getMiddleElement(numbers));
    }

    public double sum(List<Integer> numbers) {
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;

        }

        return sum;
    }

    public Object getMiddleElement(List<?> list) {
        if (list.size() > 0) {
            return list.get(list.size() / 2);
        } else {
            return null;
        }
    }
}
