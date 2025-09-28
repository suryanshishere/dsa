public class Main{
    public static void main(String[] args){
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(10);
        myBST.insert(20);
        myBST.insert(5);
        myBST.insert(40);
        myBST.insert(25);

        // System.out.println("Root: " + myBST.root.right.right.val);
        System.out.println("Contains: 40 " + myBST.contains(450));
    }
}