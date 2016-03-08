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
public class Node {
    protected int key;
    protected String name;
    protected Node left, right;
    public Node(){
        left = right = null;
        name = "";
    }
    public Node(int el){
        this(el,"unnamed",null,null);
        
    }
    public Node(int el, String n){
        this(el,n,null,null);
    }
    public Node(int el,String n, Node lt, Node rt){
        key = el; 
        left = lt;
        right = rt;
        name = n;
    }
}
