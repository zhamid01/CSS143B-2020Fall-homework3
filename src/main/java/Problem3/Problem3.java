package Problem3;

import Problem1.ArrayStack;
import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;
import java.util.List;

/*
I was not able to get a successful test. What I wanted to do here was go through and add put each node into
my reverse LinkedList stack using a for loop. Then I wanted to go through the reverse LinkedList Stack and
print the return value of the reverse.pop.
 */
public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if (list == null) {
            return;
        } else {
            LinkedListStack reverse = new LinkedListStack();
            for (ListNode i = list; i != null; i = i.next) {
                reverse.push(i);
            }
            for (int i = reverse.size(); i > 0; i--) {
                print.println(reverse.pop());
            }
        }
    }
}
