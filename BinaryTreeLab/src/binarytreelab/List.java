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
public class List {
   
    protected IntNode head, tail;
    public List(){
        head = tail = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addToHead(int el){
        head = new IntNode(el,head);
        if (tail == null){
            tail = head;
        }
    }
    
    public void addToTail(int el){
        if (!isEmpty()){
            tail.next = new IntNode(el);
            tail = tail.next;
        }
        else{
            head = tail = new IntNode(el);
        }
    }
    public void addToTail(Object el)
    {
        
    }
    public int deleteFromHead(){//delete the head and return its info;
        int el = head.info;
        if (head == tail)  //if only one node on the list;
            head = tail = null;
        return el;
    }
    public int deleteFromTail(){ //delet the tail and return its info;
        int el = tail.info;
        if (head==tail){
            head = tail = null;
        }
        else{
            IntNode tmp;
            for(tmp = head; tmp.next != tail; tmp =tmp.next);
            tail = tmp;
            tail.next = null;
        }
        return el;
    }
    public void printAll(){
        for (IntNode tmp = head; tmp != null; tmp = tmp.next)
            System.out.print (tmp.info + " ");
    }
    public boolean isInList(int el){
        IntNode tmp;
        for (tmp = head; tmp !=null && tmp.info != el; tmp = tmp.next){}
        return tmp !=null;
    }
    public void addBeforeCurrent(int el){
        if(!isEmpty()){
            if(head == tail){
                addToHead(el);
                
            }
            else{
                for (IntNode tmp = head; tmp.info == el; tmp = tmp.next)
                {
                    IntNode temp = tmp.next;
                    tmp.next = new IntNode(el,temp);
                    
                }
            }
        }
            
        
    }

    
}
