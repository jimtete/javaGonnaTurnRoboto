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
public class DomesDedomenon3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList L = new LinkedList();
        LinkedList L2 = new LinkedList();
        
        L.insertLast(1);
        L.insertLast(2);
        L.insertLast(3);
        L.insertLast(4);
        L.insertLast(5);
        
        try{
            System.out.println("List size: "+L.size());
            System.out.println("List max: "+L.maxOfList());
            System.out.println("List: ");L.printList();
        }catch(ListEmptyException LEE){
            System.out.println("IS EMPTY");
        }
        
        
    }
    
}
