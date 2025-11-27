package DSALearning.BinarySearchTree;

import DSALearning.Basic.Common;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

//        myBST.insert(10);
//        myBST.insert(20);
//        myBST.insert(5);
//        myBST.insert(40);
//        myBST.insert(25);
//
//        // System.out.println("Root: " + myBST.root.right.right.val);
//        System.out.println("Contains: 40 " + myBST.contains(450));

        myBST.rInsert(10);
        myBST.rInsert(30);
        myBST.rInsert(5);
        myBST.rInsert(40);
        myBST.rInsert(25);

        // myBST.deleteNode(40);

//        System.out.println(myBST.rContains(40));

        Common.printArray(myBST.BFS());
    }
}
