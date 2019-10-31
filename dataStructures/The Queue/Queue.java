/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Arrays;

/**
 *
 * @author jim-t
 */
public class Queue {

    private String[] queueArray;
    
    private int queueSize;
    
    private int front, rear, numberOfItems = 0;
    
    Queue(int size){
        
        queueSize = size;
        
        queueArray = new String[size];
        
        Arrays.fill(queueArray, "-1");
        
    }
    
    public void insert(String input){
        
        if(numberOfItems<queueSize){
            queueArray[rear]=input;
            
            rear++;
            
            numberOfItems++;
            
            System.out.println("INSERT "+input+" was added to the queue");
        }else{
            System.out.println("Sorry but the queue is full");
        }
    }
    
    public void remove(){
        if (numberOfItems > 0 ){
            System.out.println("Remove " + queueArray[front] + " was removed from the queue");
            queueArray[front]="-1";
            front++;
            numberOfItems--;
        }else{
            System.out.println("Sorry but the queue is empty");
        }
    }
    
    public void priorityInsert(String input){
        int i;
        if (numberOfItems==0){
            insert(input);
        }else{
            for (i= numberOfItems-1;i>=0;i--){
                
                if (Integer.parseInt(input)> Integer.parseInt(queueArray[i])){
                    queueArray[i+1] = queueArray[i];
                }else break;
            }
            
            queueArray[i+1] = input;
            
            rear++;
            numberOfItems++;
        }
    }
    
    public void peek(){
        System.out.println("The first element is "+ queueArray[front]);
    }
    
    public static void main(String[] args) {
        Queue theQueue = new Queue(10);
        theQueue.priorityInsert("10");
        theQueue.priorityInsert("25");
        theQueue.priorityInsert("11");
        
        theQueue.displayTheQueue();
        
        theQueue.remove();
        
        theQueue.displayTheQueue();
        
        theQueue.peek();
        
    }

    private void displayTheQueue() {
        for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < queueSize; n++){
			
			System.out.format("| %2s "+ " ", n);
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < queueSize; n++){
			
			
			if(queueArray[n].equals("-1")) System.out.print("|     ");
			
			else System.out.print(String.format("| %2s "+ " ", queueArray[n]));
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		// Number of spaces to put before the F
		
		int spacesBeforeFront = 3*(2*(front+1)-1);
		
		for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");
		
		System.out.print("F");
		
		// Number of spaces to put before the R
		
		int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);
		
		for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");
		
		System.out.print("R");
		
		System.out.println("\n");
    }
    
}
