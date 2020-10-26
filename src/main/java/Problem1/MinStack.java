package Problem1;

import java.lang.reflect.Array;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    private ArrayStack<Integer> min;
    private ArrayStack<Integer> store;

    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    public MinStack(int size) {
        super(size);
        min = new ArrayStack(size);
    }

    @Override
    public boolean push(Integer val) {
        if (super.size() == 0) {
            min.push(val);
        }
        else if (min.peek() > val ) {
            int s = min.pop();
            store.push(s);
            min.push(val);
        }
        else if (min.peek() < val) {
            store.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        if (super.size() == 0) {
        }
        else {
            int compare = super.peek();
            if (min.peek() > compare) {
                min.pop();
                min.push(compare);
            }
            else if (min.peek() < compare) {
                store.push(compare);
            }
        }
        return super.pop();
    }

    public Integer getMin() {
        if (min.size() == 0) {
            return null;
        }
        return min.peek();
    }
}

