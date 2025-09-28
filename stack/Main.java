public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);

        myStack.push(20);
        myStack.pop();

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
    }
}