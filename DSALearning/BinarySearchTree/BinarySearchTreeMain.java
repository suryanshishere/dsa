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

        myBST.rInsert(47);
        myBST.rInsert(21);
        myBST.rInsert(76);
        myBST.rInsert(18);
        myBST.rInsert(27);
        myBST.rInsert(52);
        myBST.rInsert(82);

        // myBST.deleteNode(40);

//        System.out.println(myBST.rContains(40));

//        Common.printArray("BFS", myBST.BFS());
//        Common.printArray("PreOrder BFS:", myBST.BFSpreOrder());
//        Common.printArray("BFS inOrder:", myBST.BFSinOrder());
    }
}
