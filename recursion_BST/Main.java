public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(10);
        myBST.rInsert(30);
        myBST.rInsert(5);
        myBST.rInsert(40);
        myBST.rInsert(25);

        // myBST.deleteNode(40);

        System.out.println(myBST.rContains(40));
    }
}
