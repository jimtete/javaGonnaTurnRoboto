/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author jim-t
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tainies Movies[] = new tainies[3];
        String [] ithopoioi =  new String[3];
        ithopoioi[0]="Scarlett Johanson";ithopoioi[1]="Adam Driver";ithopoioi[2]="Ray Liotta";
        
        Movies[0] = new tainiaComedy(new String[]{"Damien Chazzele"}, 2016, "La la land", "Will Smith");
//        Movies[0] = new tainiaComedy(new String[]{"Jon Lucas","Scott Moore"}, 2009, "Hangover", "Todd Phillips");
        Movies[1] = new tainiaDrash("Liu wang", "Illumination Animation", 2019, "John Wick 3", "Chad Stahelski");
        Movies[2] = new tainiaDrama(ithopoioi, 2019, "Marriage Story", "Noah Bauchman");
        
        
        //Change to Noah
        if (Movies[2].isDirector("Noah Bauchman"))System.out.println("It is NB");
        else System.out.println("It's not him");
        
        for (int i=0;i<Movies.length;i++){
            System.out.println(Movies[i].getDirectorName());
            System.out.println("----------------");
        }
        
        System.out.println("La la land is "+Movies[0].yearsOld()+" years old.");
        
    }
    
}
