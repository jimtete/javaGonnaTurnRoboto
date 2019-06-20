/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_grammika_systhmata;

/**
 *
 * @author jim-t
 */
public class Algorithms_Grammika_Systhmata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m=3;
        int n=4;
        double Pin[][] = new double[m][n];
        for (int i=0;i<m;i++){
            System.out.println("Give me n" + (i+1) + " for X Y Z");
            for (int j=0;j<n-1;j++){
                System.out.print("Give me n"+(i+1)+" for " + getSMH(j));
                Pin[i][j] = UserInput.getDouble();
            }
            System.out.print("Give me result: ");
            Pin[i][n-1] =  UserInput.getInteger();
            System.out.println(Pin[i][0] +"X +(" + Pin[i][1]+ ")Y + (" + Pin[i][2]+ ")Z = " + Pin[i][3]);
        }
        
        int c=0;
        double tmp[] = new double[2];
        tmp[0] = Pin[1][0]/Pin[0][0];
        tmp[1] = Pin[2][0]/Pin[0][0];
        ChangePins(tmp,c,Pin,m,n);
        c=1;

        tmp[1] = Pin[2][1]/Pin[1][1];
        //System.out.println(tmp[1]);
        ChangePins(tmp,c,Pin,m,n);
        
        double z = Pin[2][3]/Pin[2][2];
        double y = (Pin[1][3]-(z*Pin[1][2]))/Pin[1][1];
        double x = (Pin[0][3]-(z*Pin[0][2])-(y*Pin[0][1]))/Pin[0][0];
        System.out.print("X :" + x);
        System.out.println();
        System.out.print("Y :" + y);
        System.out.println();
        System.out.print("Z :" + z);
        System.out.println();
        
          
    }

    private static String getSMH(int j) {
        if (j==0){return "X: ";}
        if (j==1){return "Y: ";}
        return "Z: ";
        
    }

    private static void ChangePins(double[] tmp,int x, double[][] Pin, int m, int n) {
        
        for (int i=x+1;i<m;i++){
            
            for (int j = 0;j<n;j++){
                //System.out.println("SS: "+Pin[x][j]*tmp[i-1]);
                Pin[i][j] = Pin[i][j] - (Pin[x][j]*tmp[i-1]);
                //System.out.print(Pin[i][j] + " ");
            }
            //System.out.println();
            
        }
        
        
    }
    
}
