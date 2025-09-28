
public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int val;
        Node next;

        Node(int value) {
            this.val = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqeue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

        length++;
    }

    public Node deqeue() {
        if (length == 0)
            return null;
        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }

        length--;
        return temp;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + first.val);
    }

    public void getLast() {
        System.out.println("Last: " + last.val);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
