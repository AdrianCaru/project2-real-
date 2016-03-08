/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreelab;

/**
 *
 * @author it.student
 */
public class BinaryTreeLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST test1 = new BST();
        test1.insert(10);
        test1.insert(2);
        test1.insert(5);
        test1.insert(22);
        test1.insert(7);
        test1.inorder();
        test1.preorder();
        
        // TODO code application logic here
    }
    
}
