/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_circle_1;

/**
 *
 * @author jim-t
 */
public class Algorithms_Circle_1 {

    /**
     * @param args the command line arguments
     */
	 
	//finds Circle area
    public static void main(String[] args) {
        System.out.println("Dwse aktina R na vrethei to emvadon kai i perimetros tou kiklou");//Give Radius: R
        double R=UserInput.getDouble();
        while (R<0){
            System.out.println("Dwse thetiko Arithmo R");//Give Radius: R > 0
            R = UserInput.getDouble();
        }
        
        System.out.println("Emvadon : " + Math.PI*Math.pow(R, 2));
        System.out.println("Perimetros : " + Math.PI*R*2);
        
        
    }
    
}
