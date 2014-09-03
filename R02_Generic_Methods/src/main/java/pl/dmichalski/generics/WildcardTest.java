package pl.dmichalski.generics;

import java.util.List;

/**
 * Author: Daniel
 */
public class WildcardTest {

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

    public <T> void print(T object) {
        System.out.println(object);
    }

    public <T> void reverse(List<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            T o = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, o);
        }
    }

    public <T extends Number> double sumTwoFirstNumbers(List<T> numbers) {
        return numbers.get(0).doubleValue() + numbers.get(1).doubleValue();
    }
}
