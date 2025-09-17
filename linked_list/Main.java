public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(10);
        myList.append(20);
        // myList.removeLast();
        // myList.prePend(20);
        // myList.removeFirst();
        // System.out.println(myList.get(2).val);
        // myList.set(1,30);
        myList.reverse();
        myList.printList();
    }
}