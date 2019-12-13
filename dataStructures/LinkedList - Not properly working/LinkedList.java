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
public class LinkedList implements List{
    
    private Node first;
    private Node last;
    
    public LinkedList(){
        first=last=null;
    }
    
    public Node getFirst(){
        return first;
    }
    
    public Node getLast(){
        return last;
    }
    
    public void printList() throws ListEmptyException{
        if (isEmpty())throw new ListEmptyException("List is empty");
        for (Node position=first;position!=null;position=position.getNext()){
            System.out.println(position.getItem());
        }
    }
    
    Object maxOfList(){
        if (isEmpty())throw new ListEmptyException("List is empty");
        Object max = first.getItem();
        Node position = first.getNext();
        while (position!=null){
            Comparable CoMax=(Comparable)max;
            Comparable CoItem=(Comparable)position.getItem();
            if (CoMax.compareTo(CoItem)<0){
                max = position.getItem();
            }
            position=position.getNext();
        }
        return max;
    }
    
    Boolean exists(Object Data) throws ListEmptyException{
        if (isEmpty())throw new ListEmptyException("List is empty");
        Node position=first;
        while (position!=null){
            if(first.getItem()==Data)return true;
            position=position.getNext();
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (first==null)return true;
        return false;
    }

    @Override
    public int size() {
        int i=0;
        Node position = first;
        while (position!=null){
            position = position.getNext();
            i++;
        }
        return i;
    }

    @Override
    public void insertFirst(Object data) {
        if (isEmpty()){
            first = last = new Node(data,null);
        }else{
            first = new Node(data,first);
        }
    }

    @Override
    public void insertLast(Object data) {
        if (isEmpty()){
            first = last = new Node(data,null);
        }else{
            Node temp = new Node(data,null);
            last.setNext(temp);
            last = temp;
        }
    }

    @Override
    public Object removeFirst() throws ListEmptyException {
        if (isEmpty()) throw new ListEmptyException("List is empty.");
        Object removedItem = first.getItem();
        if (first == last){
            first = last = null;
        }else{
            first = first.getNext();
        }
        return removedItem;
    }
    
    

    @Override
    public Object removeLast() throws ListEmptyException {
        if (isEmpty()) throw new ListEmptyException("List is empty.");
        Object removedObject = last.getItem();
        if (first == last){
            first = last = null;
        }else{
            Node position;
            for (position = first; position.getNext()!=last;position=position.getNext()){};
            last = position;
            position.setNext(null);
        }
        return removedObject;
    }
    
}
