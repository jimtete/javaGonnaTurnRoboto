/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedexcercise2;

/**
 *
 * @author jim-t
 */
public class ObjectOrientedExcercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int N = 5;/*UserInput.getInterger()*/
        
        Employee E[] = new Employee[N];
        int i;
        int type;
        Misthotos M;
        Oromisthios O;
        Symvasiouxos S;
        for (i=0;i<N;i++){
            System.out.println("Give me type of Employee");
            type=UserInput.getInteger();
            switch (type){
                case 1: E[i] = new Misthotos(2300, 450, i*50, "ATEITHE", type);
                M = (Misthotos) E[i];
                M.Katharos_Misthotou();
                System.out.println(M.toString() + "Pay type: " + M.getPayType());
                break;
                case 2: E[i] = new Oromisthios(30, 12+i*2, "AUTH", type);
                O = (Oromisthios) E[i];
                O.Katharos_Oromisthiou();
                System.out.println(O.toString() + "Pay type: " + O.getPayType());
                break;
                case 3: E[i] = new Symvasiouxos(1900 + i*100, 250, i+2, "TEICM", type);
                S = (Symvasiouxos) E[i];
                S.Katharos_Symvasiouxou();
                System.out.println(S.toString() + "Pay type: " + S.getPayType());
                break;
                default: System.out.println("Wrong input");
                break;
            }
        }
        
    }
    
}
