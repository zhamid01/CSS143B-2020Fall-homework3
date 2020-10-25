package Problem1;

import java.util.Objects;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        this.size = 0;
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
        T val = (T) data[--size];
        data[size] = null;
        return val;
    }

    @Override
    public T peek() {
        T val = (T) data[size];
        if (data[size] != null) {
            return val;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
