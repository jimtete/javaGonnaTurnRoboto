/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedexcercise1;

/**
 *
 * @author jim-t
 */
public class ObjectOrientedExcercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int N = 5;//UserInput.getInteger();
        
        Antiprosopoi_Poliseon ANT[] = new Antiprosopoi_Poliseon[N];
        System.out.println("Give me type");
        int type;
        for (int i=0;i<N;i++){
            type = UserInput.getInteger();
            
            switch (type){
                case 1: ANT[i] = new antiprosoposAthenas(12000, 3000*(i+1), "Nijjer", 35000*(N-i), type, i);
                break;
                case 2: ANT[i] = new antiprosoposSalonikas(16000, "Axilleas=Nigger", 25000, 2, 1);
                break;
                default: ANT[i] = new antiprosoposOtherCity("A.E.", 3000+(3000*i), type, i);
                
            }
            System.out.println(ANT[i].toString());
            ANT[i].TelikoPosoPromitheias();
        }
        
        
    }
    
}
