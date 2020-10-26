package Problem3;

import Problem1.ArrayStack;
import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        LinkedListStack reverse = new LinkedListStack();

        while (list != null) {
            reverse.push(list);
        }
        for (int i = 0; i < reverse.size(); i++) {
            print.println(reverse.pop());
        }
    }
}
