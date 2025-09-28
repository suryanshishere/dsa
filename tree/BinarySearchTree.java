
public class BinarySearchTree {
    Node root;

    class Node {
        int val;
        Node left;
        Node right;

        Node(int value) {
            this.val = value;
        }
    }

    // public BinarySearchTree(){
    // root = null;
    // }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            if (newNode == temp)
                return false;

            if (newNode.val > temp.val) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            } else {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
        }
    }

    public boolean contains(int value){
        Node newNode = new Node(value);
        Node temp = root;
        if(temp == null) return false;
        while(temp != null){
            if(newNode.val == temp.val) return true;
            if(newNode.val > temp.val){
                // if(temp.right == null){
                //     return false;
                // }
                temp = temp.right;
            }else{
                // if(temp.left == null){
                //     return false;
                // }
                temp = temp.left;
            }
        }

        return false;
    }
}
