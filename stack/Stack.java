class Node {
    int val;
    Node next;

    Node(int value) {
        this.val = value;
    }
}

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return null;
        if(height == 1) {
            top = null;
            height = 0;
            return top;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.val);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

}
