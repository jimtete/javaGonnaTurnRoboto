/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domesdedomenon3;

/**
 *
 * @author jim-t
 */
public class Node {
    
    private Object data;
    private Node next;
    
    public Node(){
        this(null,null);
    }
    
    public Node(Object d,Node n){
        data=d;
        next=n;
    }
    
    public Object getItem(){
        return data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setItem(Object d){
        data=d;
    }
    
    public void setNext(Node n){
        next=n;
    }

    @Override
    public String toString() {
        return data.toString();
    }
    
    
    
}
