public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(1709);
        myHeap.insert(69);
        myHeap.insert(9);
        myHeap.insert(98);
        myHeap.insert(118);
        System.out.print(myHeap.getHeap());
    }
}