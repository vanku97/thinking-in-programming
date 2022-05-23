package base;

import java.util.Comparator;

/**
 * @author vanku
 * @date 2020/6/8
 * @title 有序二叉树
 */


public class BST<Key extends Comparable<Key>, Value> {


    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;
        private int N;
        public Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node root, Key key) {
        if (root == null) { return null; }
        int i = key.compareTo(root.key);
        if (i > 0) { return get(root.right, key); }
        if (i < 0) { return get(root.left, key); }
        return root.value;
    }

    public int size(){
        return root.N;
    }
    private int size(Node node){
        if (node==null)return 0;
        else return node.N;
    }


    public void put(Key key,Value value){
        root = put(root,key,value);
    }

    public Node put(Node root,Key key,Value value){
        if (root==null){ return new Node(key,value,1); }
        int i = key.compareTo(root.key);
        if (i>0) root.right =  put(root.right,key,value);
        else if (i<0)root.left =  put(root.left,key,value);
        else root.value = value;
        root.N = size(root.left) + size(root.right) + 1;
        return root;
    }


    public static void main(String[] args) {
        BST<Integer,String> bst = new BST<>();
        bst.put(1,"b");
        bst.put(2,"b");
        bst.put(3,"b");
        System.out.println(bst.size());
    }



}
