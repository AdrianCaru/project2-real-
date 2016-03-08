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
public class LinenumList extends List {
public String toString() {
        String s = "";
        for (IntNode tmp = head; tmp != null; tmp = tmp.next) {
            s += tmp.info.toString();
            if (tmp.next != null)
                s += ", ";
        }
        return s;
    }
    public void add(Object el) {
        super.addToTail(el);
    }  // Assuming your SLList class has an add() method
}
