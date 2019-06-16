/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_numeric_systems;

/**
 *
 * @author jim-t
 */
public class Algorithms_Numeric_Systems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Give me a number to turn : ");
        int n = UserInput.getInteger();
        int m = n;
        int n2=0;
        int n8=0;
        int x=1;
        while (n!=0){
            
            n2 = n2+(n%2)*x;
            n = n/2;
            x=x*10;
        }
        x=1;
        while (m!=0){
            
            n8 = n8+(m%8)*x;
            m = m/8;
            x=x*10;
        }
        System.out.println("Binary form of n : " + n2);
        System.out.println("Octal form of n : " + n8);
        
        
    }
    
}
