/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurespractice3;

import java.util.Arrays;

/**
 *
 * @author jim-t
 */
public class DataStructuresPractice3 {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack=-1;
    
    DataStructuresPractice3 (int size){
        stackSize=size;
        stackArray = new String[size];
        Arrays.fill(stackArray,"-1");
    }
    
    public void pushMany(String multipleValues){
        String[] tempString = multipleValues.split(" ");
        for (int i = 0;i < tempString.length;i++){
            push(tempString[i]);
        }
    }
    
    public void push(String input){
        if (topOfStack + 1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;
        }else System.out.println("Not enough space");
        
        displayTheStack();
        System.out.println("PUSH " + input + " was added to the stack");
    }
    
    public String pop(){
        if(topOfStack>=0){
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " was removed from array");
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        }else{
            displayTheStack();
            System.out.println("Sorry but the stack is Empty");
        }
        
        return "-1";
           
        
        
    }
    
    public String peek(){
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " is at the top of the array");
        return stackArray[topOfStack];
    }
    
    public void popAll(){
        for (int i=topOfStack;i>=0;i--){
            pop();
        }
    }
    
    public static void main(String[] args) {
        
        DataStructuresPractice3 DS = new DataStructuresPractice3(10);
        
        DS.push("10");
        DS.push("15");
        DS.peek();
        DS.pop();
        DS.pushMany("18 25 35 45 54");
        DS.popAll();
        DS.displayTheStack();
        
        
    }

    private void displayTheStack() {
        for(int n = 0; n < 61; n++)System.out.print("-");
			
			System.out.println();
			
			for(int n = 0; n < stackSize; n++){
				
				System.out.format("| %2s "+ " ", n);
				
			}
			
			System.out.println("|");
			
			for(int n = 0; n < 61; n++)System.out.print("-");
			
			System.out.println();
			
			for(int n = 0; n < stackSize; n++){
				
				
				
				if(stackArray[n].equals("-1")) System.out.print("|     ");
				
				else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
				
			}
			
			System.out.println("|");
			
			for(int n = 0; n < 61; n++)System.out.print("-");
			
			System.out.println();
    }

    
    
}
