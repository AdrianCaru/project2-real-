/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreelab;

/**
 *
 * @author Adrian
 */
public class BST {
    protected Node root;
    
    public BST(){
        root = null;
    }
    protected void visit(Node p){
        System.out.print(p.key + " ");
    }
    /*public Node search (Node p, int el){
        return search(p, root);
    }*/
    public Node search(Node p, int el){
        while(p != null)
            if(el == p.key)
                return p;
            else if(el < p.key)
                p = p.left;
            else p = p.right;
        return null;
    }
    protected void preorder(Node p){
        if (p != null){
        visit(p);
        preorder(p.left);
        preorder(p.right);
    }
    }
    public void preorder(){
        preorder(root);
    }
    protected void inorder(Node p){
        if (p != null){
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
        
    }
    public void inorder(){
        inorder(root);
    }
    protected void postorder(Node p){
        if (p != null){
            postorder(p.left);
            postorder(p.right);
            visit(p);
        }
    
    }
    public void postorder(){
        postorder(root);
    }
    public void insert(int el){
        Node p = root, prev = null;
        while(p != null){ //find a place for inserting new node;
            prev = p;
            if (p.key < el){
                p = p.right;
            }
            else{ p = p.left;}
        }
        if (root == null){ // tree is empty
            root = new Node(el);
        }
        else if (prev.key < el) {
            prev.right = new Node(el);
        }
        else{
            prev.left = new Node(el);
        }
    }
}
