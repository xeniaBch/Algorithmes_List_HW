
public class List {

    private Node head;
    private Node tail;

    //add element in end of list
    public void add(int item) {
        Node temp = new Node();
        temp.value = item;
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    public boolean isPalindrome() {
        Stack stack = new Stack();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.value);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.value != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void remove(int k) {
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.value == k) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next.value == k) {
                if (tail == temp.next) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // I don't like this decision
    public void jointList(List list1, List list2) {
        List joint = new List();
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        while ((temp1 != null) || (temp2 != null)) {
            if (temp2 == null) {
                joint.add(temp1.value);
                temp1 = temp1.next;
                continue;
            }
            if (temp1 == null) {
                joint.add(temp2.value);
                temp2 = temp2.next;
                continue;
            }
            if (temp1.value < temp2.value) {
                joint.add(temp1.value);
                temp1 = temp1.next;
                continue;
            }
            joint.add(temp2.value);
            temp2 = temp2.next;
        }
        joint.printList();
    }

    private class Node {
        int value;
        Node next;
    }
}
