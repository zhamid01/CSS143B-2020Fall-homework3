package Problem3;

import Problem1.ArrayStack;
import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;
import java.util.List;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if (list == null) {
            return;
        } else {
            LinkedListStack reverse = new LinkedListStack();
            for (ListNode i = list; i != null; i = i.next) {
                reverse.push(i);
            }
            for (int i = 0; i < reverse.size(); i++) {
                print.println(reverse.pop());
            }
        }
    }
}
