package pl.dmichalski.generics;

import java.lang.reflect.Method;

/**
 * Author: Daniel
 */
public class Pair<K, V> {

    private K key;

    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    protected Pair<K, V> clone() throws CloneNotSupportedException {
        Pair<K, V> newPair = (Pair<K, V>) super.clone();

        try {
            Class<?> aClass = this.key.getClass();
            Method methodClone = aClass.getMethod("clone", new Class[0]);
            Object clonedObj = methodClone.invoke(this.key, new Object[0]);
            newPair.key = (K) clonedObj;

            aClass = this.value.getClass();
            methodClone = aClass.getMethod("clone", new Class[0]);
            clonedObj = methodClone.invoke(this.value, new Object[0]);
            newPair.value = (V) clonedObj;
        } catch (Exception e) {
            throw new CloneNotSupportedException(e.toString());
        }

        return newPair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Pair<?, ?> pair = (Pair<?, ?>) o;

        if (key != null ? !key.equals(pair.key) : pair.key != null) return false;
        if (value != null ? !value.equals(pair.value) : pair.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
