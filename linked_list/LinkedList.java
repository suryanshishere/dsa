class Node {
    int val;
    Node next;
    int length;

    public Node(int val) {
        this.val = val;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int val) {
        Node newNode = new Node(val);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void append(int val) {
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        //for tail necessary below otherwise tail will be still point to previous node if length is 1
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prePend(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length==0)return null;
        Node temp = head;
        head = head.next;
        temp.next = null;    
        length--;
        //for tail necessary below otherwise tail will be still point to previous node if length is 1
        if(length ==0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index<0 || index > length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp == null) return false;
        temp.val = value;
        return true;
    }

    public boolean insert(int index, int value){
        if(index == 0) {prePend(value); return true;};
        if(index == length) {append(value); return true;}
        Node newNode = new Node(value);
        Node pre = get(index-1);
        if(pre == null) return false;
        newNode.next = pre.next;
        pre.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index <0 || index >= length) return null;
        if(index ==0){return removeFirst(); }
        if(index == length){return removeLast(); }
        Node pre = head;
        for(int i =0; i < index; i++){
            pre = pre.next;
        };
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head; 

        while(curr != null){
            Node temp = curr;
            curr.next = prev;
            prev = temp;
            curr = temp.next;
        }

        Node temp = head;
        head = tail;
        tail = temp;
    }

}
