package Problem1;

import java.lang.reflect.Array;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    private ArrayStack<Integer> min;

    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    public MinStack(int size) {
        super(size);
        min = new ArrayStack<>(size);
    }

    @Override
    public boolean push(Integer val) {
        if (min.peek() == null)  {
            min.push(val);
        }
        else if (min.peek() > val) {
            min.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        if (super.peek() != null &&
                super.peek() == min.peek()) {
            min.pop();
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

