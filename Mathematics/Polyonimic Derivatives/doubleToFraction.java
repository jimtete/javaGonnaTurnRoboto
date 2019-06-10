/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyonimicderivatives;

/**
 *
 * @author jim-t
 */
public class doubleToFraction {

    static int turnUp(double N) {
        int i=1;
        int j;
        double G=1.0;
        double NN;
        boolean rep=true;
        do{
            i++;
            NN=N*i;
            j = (int) NN;
            if (NN*G==j*G){
                rep=false;
            }
            
        }while (rep);
        return j;
        
    }

    static int turnDown(double N) {
        int i=1;
        int j;
        double G=5.0;
        double NN;
        boolean rep=true;
        do{
            i++;
            NN=N*i;
            j = (int) NN;
            if (NN*G==j*G){
                rep=false;
            }
            
        }while (rep);
        return i;
    }
    
}
