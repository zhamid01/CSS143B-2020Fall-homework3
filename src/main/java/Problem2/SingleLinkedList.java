package Problem2;

import java.util.LinkedList;
import java.util.List;

/* This site was used as help in this code:
https://www.geeksforgeeks.org/reverse-a-linked-list/
 */

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }
    //Used Professor's Video
    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        if (list == null) {
            return;
        }
        ListNode n1 = new ListNode();
        head = n1;
        ListNode n2 = list.head.next;

        while (n2 != null) {
            n1.next = new ListNode(n2.val);
            n1 = n1.next;
            n2 = n2.next;
        }
        size = list.size;
    }

    public int removeAll(int valueToRemove) {
        int count = 0;
        ListNode n2 = head;
        if (n2.val == valueToRemove) {
            n2 = n2.next;
            count++;
            size = size -1;
        }
        ListNode n1 = head;
        while (n1.next != null) {
            if (n1.next.val == valueToRemove) {
                n1.next = n1.next.next;
                count++;
                size = size - 1;
            } else {
                n1 = n1.next;
            }
        }
        return count;
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        ListNode temp = null;
        ListNode main = head.next;
        while (main != null) {
            ListNode next = head.next.next;
            next = main.next;
            main.next = temp;
            temp = main;
            main = next;
        }
        head.next = temp;
    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
