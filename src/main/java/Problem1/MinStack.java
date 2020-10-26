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
            //Empty Stack
        }
        else {
            int compare = super.peek();
            if (min.peek() == compare) {
                min.pop();
            }
        }
        return super.pop();
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        return min.peek(); // place holder
    }
}

