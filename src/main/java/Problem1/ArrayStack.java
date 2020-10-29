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
        if (size < data.length) {
            data[size] = val;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        T val = data[size - 1];
        data[size - 1] = null;
        size--;
        return val;
    }

    @Override
    public T peek() {
        if (size == 0) {
            return null;
        }
        T val = data[size - 1];
        return val;
    }

    @Override
    public int size() {
        return size;
    }
}
