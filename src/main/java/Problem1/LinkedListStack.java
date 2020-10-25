package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        this.data = new LinkedList<>();
    }

    @Override
    public boolean push(T val) {
        if (val != null) {
            data.addLast(val);
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        T val = data.getLast();
            data.removeLast();
        return val;
    }

    @Override
    public T peek() {
        T val = data.getLast();
        return val;
    }

    @Override
    public int size() {
        return data.size();
    }
}
