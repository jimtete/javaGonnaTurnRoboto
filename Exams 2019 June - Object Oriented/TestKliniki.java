/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkliniki;

/**
 *
 * @author user
 */
public class TestKliniki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int N=6;
        Kliniki K[] = new Kliniki[N];
        K[0] = new Gynaikologiko(1500, "GENHMMATAS", 1, 3, 250, 0, 3);
        K[1] = new Gynaikologiko(0, "PAPANIKOLAOY", 1, 1, 100, 2, 0);
        K[2] = new Orthopediko(800, "DIAVALKANIKO", 2, 2, 400, 1, 3);
        K[3] = new Orthopediko(0, "NIKKALE", 2, 1, 100, 2, 0);
        K[4] = new Paidiatriko(600, "AGIOS FANOYRIOS", 1, 2, 100, 1, 4);
        K[5] = new Paidiatriko(0, "SFETSOS A.E.", 3, 1, 0, 1, 0);
        
        Gynaikologiko G;
        Orthopediko O;
        Paidiatriko P;
        for (int i=0;i<N;i++){
            double XEPT = K[i].getKostosEpiskepsis();
            try{
                checkVisitCost(XEPT);
            }catch (lathosKostosEpiskepsis LKE){
                LKE.printStackTrace();
                K[i].setKostosEpiskepsis(100);
            }
            if (K[i] instanceof Gynaikologiko){
                G = (Gynaikologiko)K[i];
                System.out.println("Tmhma: " + G.getTmima()+ "   " + G.toString());
                G.eidosTherapias();
                G.pliroteoPoso();
            }else{
                if (K[i] instanceof Orthopediko){
                    O = (Orthopediko)K[i];
                    System.out.println("Tmhma: " + O.getTmima()+ "   " + O.toString());
                    O.eidosTherapias();
                    O.pliroteoPoso();
                }else{
                    P = (Paidiatriko)K[i];
                    System.out.println("Tmhma: " + P.getTmima()+ "   " + P.toString());
                    P.eidosTherapias();
                    P.pliroteoPoso();
                }
            }
        }
        
        
    }
    
    static void checkVisitCost(double cost) throws lathosKostosEpiskepsis{
        if (cost==0){
            throw new lathosKostosEpiskepsis("Cost cannot be 0, incorrect input, sets EXODA back to 100$");
        }else{
            System.out.println("Cost checked: correct input");
        }
    }
    
}
