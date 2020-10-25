package Problem1;

import java.util.Objects;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        this.size = capacity;
        this.data = (T[]) new Object[capacity];
    }

    @Override
    public boolean push(T val) {
        if (size  < data.length) {
            data[size++] = val;
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        // homework
        T val = null;   // place holder
        return val;   // place holder
    }

    @Override
    public T peek() {
        // homework
        T val = null;   // place holder
        return val;   // place holder
    }

    @Override
    public int size() {
        return size;
    }
}
