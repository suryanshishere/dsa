public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(20);

        myDLL.append(30);
        myDLL.prepend(10);
        // myDLL.removeLast();
        // myDLL.removeFirst();
        // myDLL.set(2,500);
        // System.out.println(myDLL.get(2).val);
        myDLL.insert(1, 500);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.length();

        myDLL.printList();
    }
}
