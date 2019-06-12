/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelladikes2019.c;

/**
 *
 * @author jim-t
 */
public class Panelladikes2019C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repeat=true;
        String Title,titleMax="titleMax";
        int views;
        int max = -1;
        int cMin=0,cMed=0,cMax=0;
        
        do{
            System.out.print("Give me title: ");
            Title = UserInput.getString();
            
            
            
            
            if (Title.equals("TELOS")){
                repeat=false;
            }else{
                do{
                    System.out.print("Give me views: ");
                    views = UserInput.getInteger();
                }while (views<0);
                if (views>max){
                    max = views;
                    titleMax = Title;
                }
                if (views>1000){
                    cMax++;
                }else{
                    if (views > 100){
                        cMed++;
                    }else{
                        cMin++;
                    }
                }
            }
            
            
            
        }while(repeat);
        
        
        System.out.println("Most viewed video: "+titleMax);
        if (cMax>cMin & cMax>cMed){
            System.out.println("Most viewed category: Ypshlh");
        }else{
            if (cMed>cMin & cMed>cMax){
                System.out.println("Most viewed category: Messaia");
            }else{
                if (cMin>cMed & cMin>cMax)System.out.println("Most viewed category: Xamhlh");
            }
        }
        
        
        
    }
    
}
