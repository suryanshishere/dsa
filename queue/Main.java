public class Main{
    public static void main(String[] args){
        Queue myQueue = new Queue(10);

        myQueue.enqeue(20);
        myQueue.enqeue(30);
        myQueue.deqeue();
        
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();
    }
}