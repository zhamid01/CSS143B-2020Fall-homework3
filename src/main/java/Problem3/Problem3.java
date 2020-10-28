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
        }
        else {
            Stack<Integer> reverse = new LinkedListStack<>();
            ListNode n1 = list.next;
            while (n1 != null) {
                reverse.push(n1.val);
                n1 = n1.next;
            }
            while (reverse.size() != 0) {
                print.println(reverse.pop());
            }
        }
    }
}
