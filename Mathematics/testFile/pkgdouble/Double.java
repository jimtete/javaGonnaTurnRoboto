/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble;

/**
 *
 * @author jim-t
 */
public class Double {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double N = 19.25; //N is the float number
        
        int A,B;
        A=doubleToFraction.turnUp(N); // Returns Numerator
        B=doubleToFraction.turnDown(N); // Returns Denominator
        System.out.println("("+A+"/"+B+")");
        
    }
    
}
