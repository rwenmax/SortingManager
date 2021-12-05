package com.sparta.model;

import java.util.ArrayList;

public class Treesort <T extends Comparable<T>>extends Sort implements Sortable<T>{

    class Node{
        T key;
        Node left, right;

        public Node(T item){
            key = item;
            left = right = null;
        }
    }

    Node root;
    T[] sortedArray;
    ArrayList<T> sortedList;
    int counter = 0;

    public Treesort(){
        root = null;
    }

    void insert(T key){
        root = insertRec(root, key);
    }

    Node insertRec(Node root, T key){
        if (root == null){
            root = new Node(key);
            return root;
        }

        if (key.compareTo(root.key) <= -1){
            root.left = insertRec(root.left, key);
        }
        else if (key.compareTo(root.key) >= 0){
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    T[] inOrderArray(Node root){
        if (root != null){
            inOrderArray(root.left);
            sortedArray[counter] = root.key;
            counter++;
            inOrderArray(root.right);
        }
        end = System.nanoTime();
        return sortedArray;
    }

    ArrayList<T> inOrderList(Node root){
        if (root != null){
            inOrderList(root.left);
            sortedList.add(root.key);
            inOrderList(root.right);
        }
        end = System.nanoTime();
        return sortedList;
    }

    public T[] sort(T[] array) {
        if (checkIfValid(array)){
            return array;
        }
        start = System.nanoTime();
        counter = 0;
        root = null;
        sortedArray = (T[]) new Comparable[array.length];
        for(int i = 0; i < array.length; i++){
            insert(array[i]);
        }
        return inOrderArray(root);
    }

    public ArrayList<T> sort(ArrayList<T> list) {
        if (checkIfValid(list)){
            return list;
        }
        start = System.nanoTime();
        root = null;
        sortedList = new ArrayList<T>();
        for (int i = 0; i < list.size(); i++){
            insert(list.get(i));
        }
        return inOrderList(root);
    }
}
