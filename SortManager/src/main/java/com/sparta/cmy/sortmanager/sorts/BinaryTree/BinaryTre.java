package com.sparta.cmy.sortmanager.sorts.BinaryTree;

import com.sparta.cmy.sortmanager.interfaces.BinaryTree;

public class BinaryTre implements BinaryTree {

    //this Node class will store int values and reference to each child.
    static class Node {

       private final int value;
       private Node leftChild;
       private Node rightChild;

        public Node(int value) {
            this.value = value;
            leftChild = null;
            rightChild = null;
        }
    }

    Node root;
    int size;
    int count;
    int[] array;

    public BinaryTre(int value) {
        this.root = new Node(value);

    }

    public BinaryTre() {
        this.root = null;
    }

    @Override
    public int getRootElement() {

        return root.value;
    }

    @Override
    public int getNumberOfElements() {

        return size;
    }

    @Override
    public void addElement(int element) {
        root = addRecursion(root, element);
        size++;
    }

    public Node addRecursion(Node current, int element) {
        if (current == null) {
            current = new Node(element);
            return current;
        }

        if (element < current.value) {
            current.leftChild = addRecursion(current.leftChild, element);

        } else if (element > current.value) {
            current.rightChild = addRecursion(current.rightChild, element);
        }
        return current;
    }


    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        if (searchElem(root, value) != null){

            return true ;
        }
        return false;

    }

//Added a method to check if the tree contains a value
    private Node searchElem(Node root, int element) {

        if (root == null) {
            return null;
        } else if (element == root.value) {
            return root;
        } else if (element > root.value) {
            return searchElem(root.leftChild, element);
        } else {
            return searchElem(root.rightChild, element);
        }
    }


//Add exceptions and logging at a later date.

   // @Override
    //public int getLeftChild(int element) throws ChildNotFoundException {
     //   if (findElement(element)) {
         //   throw new ChildNotFoundException("no kids here");
       // }
        //return searchElem(root, element).leftChild.value;
   // }

    //@Override
    //public int getRightChild(int element) throws ChildNotFoundException {
    //    if (findElement(element)){
      //      throw new ChildNotFoundException("no kids here");
        //}
        //return searchElem(root, element).rightChild.value;
    //}

    @Override
    public int[] getSortedTreeAsc() {
        array = new int[size];
        count = 0;
        ascRec(root);
        return null;
    }

    private void ascRec(Node current) {
        if (current != null) {
            ascRec(current.leftChild);
            array[count++] = current.value;
            ascRec(current.rightChild);

        }
    }

    @Override
    public int[] getSortedTreeDesc() {
        array = new int[size];
        count = 0;
        descRec(root);
        return null;
    }

    private void descRec(Node current) {
        if (current != null) {
            descRec(current.rightChild);
            array[count++] = current.value;
            descRec(current.leftChild);
        }
    }
}



