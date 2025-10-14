public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(19);
        myHeap.insert(69);
        myHeap.insert(9);
        myHeap.insert(98);
        myHeap.insert(118);

        myHeap.remove();
        myHeap.remove();

        System.out.print(myHeap.getHeap());
    }
}