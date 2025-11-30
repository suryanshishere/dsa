package DSALearning.BinarySearchTree;

import DSALearning.Basic.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree {
    Node root;

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

    public boolean contains(int value) {
        Node newNode = new Node(value);
        Node temp = root;
        if (temp == null) return false;
        while (temp != null) {
            if (newNode.val == temp.val) return true;
            if (newNode.val > temp.val) {
                // if(temp.right == null){
                //     return false;
                // }
                temp = temp.right;
            } else {
                // if(temp.left == null){
                //     return false;
                // }
                temp = temp.left;
            }
        }

        return false;
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null)
            return false;
        if (currentNode.val == value)
            return true;

        if (value < currentNode.val) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null)
            return new Node(value);
        if (value < currentNode.val) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.val) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null)
            root = new Node(value);
        rInsert(root, value);
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;
        if (value < currentNode.val) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.val) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null & currentNode.right == null) {
                return null;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else {
                int minSubTree = minValue(currentNode.right);
                currentNode.val = minSubTree;
                currentNode.right = deleteNode(currentNode.right, minSubTree);
            }
        }

        return currentNode;
    }

    private int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.val;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> myQueue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        myQueue.add(currentNode);
        while (!myQueue.isEmpty()) {
            currentNode = myQueue.remove();
            result.add(currentNode.val);

            if (currentNode.left != null) {
                myQueue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                myQueue.add(currentNode.right);
            }
        }

        return result;
    }

    public ArrayList<Integer> BFSpreOrder(){
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                result.add(currentNode.val);
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }

        new Traverse(root);

        return result;
    }

    public ArrayList<Integer> BFSpostOrder(){
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
                result.add(currentNode.val);
            }
        }

        new Traverse(root);
        return result;
    }

    public ArrayList<Integer> BFSinOrder(){
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                result.add(currentNode.val);
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }


}
