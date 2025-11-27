package DSALearning.Stack;

public class Stack {
    private DSALearning.Basic.Node top;
    private int height;

    public Stack(int value) {
        DSALearning.Basic.Node newNode = new DSALearning.Basic.Node(value);
        top = newNode;
        height = 1;
    }

    public void push(int value) {
        DSALearning.Basic.Node newNode = new DSALearning.Basic.Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public DSALearning.Basic.Node pop() {
        if (height == 0) return null;
        if (height == 1) {
            top = null;
            height = 0;
            return top;
        }
        DSALearning.Basic.Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void printStack() {
        DSALearning.Basic.Node temp = top;
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
