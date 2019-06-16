/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author jim-t
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give me an integer number");
        int n = UserInput.getInteger();
        int nR=0;
        while (n!=0){
            nR = nR*10+(n%10);
            n = n/10;
        }
        System.out.println("Reverse n : " + nR);
        
    }
    
}
