package tutorial5;

import java.util.Arrays;

/**
 * This is the class template you must implement. This means to replace all TODOs
 * by meaningful code until all tests in SimpleListTests succeed.
 * <p>
 * This is an example of test driven development. The specifications are defined by the test cases.
 * <p>
 * RULES:
 * 1. You are not allowed to change the definition of the single instance variable
 * 2. You are not allowed to add instance variables
 */


public class SimpleList<E> {

    // Generic types cannot be arrays as they are only resolved at runtime
    // While this is an Object array, we maintain type safety by only accessing it with objects of type <E>
    private Object[] array;
    private int size = 0; // Tracks how many elements are stored

    public SimpleList() {
        this(10);
    }

    public SimpleList(int num) {
        array = new Object[num];
    }

    public void add(E element) {
        //TODO

        this.size++;
        array = Arrays.copyOf(array, this.size);
        array[this.size - 1] = element;
    }

    public void remove(int index) {
        //TODO
        if (index < 0) {
            return;
        }
        int numMoved = this.size - index - 1;
        if (numMoved >= 0) {
            System.arraycopy(array, index + 1, array, index, numMoved);
            array[--this.size] = null;
        }

    }

    public E get(int index) {
        //TODO
        if (index >= 0 && index < this.size) {
            return (E) this.array[index]; // Replace this
        } else {
            return null;
        }
    }

    public int size() {
        //TODO
        return this.size; // Replace this
    }

}
