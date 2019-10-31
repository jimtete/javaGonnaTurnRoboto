/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goulianascmagkiaklania;

import java.util.Scanner;

/**
 *
 * @author jim-t
 */
public class GoulianasCMagkiaKlania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(show());
    }

    private static int show() {
        Scanner s = new Scanner(System.in);
        int i=s.nextInt();
        if (i<=0){
            return 0;
        }else{
            return i+show();
        }
    }
    
}
