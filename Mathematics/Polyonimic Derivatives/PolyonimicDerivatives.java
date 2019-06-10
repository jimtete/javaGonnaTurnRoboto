package polyonimicderivatives;


public class PolyonimicDerivatives {

    
    public static void main(String[] args) {
        
        String var = "x";
        int N=1000;
        double PS[] = new double[N];
        int PP[] = new int[N];
        int pow,i=0;
        double syn;
        do{
            
            System.out.print("Give me SYN: ");
            syn = UserInput.getDouble();
            System.out.print("Give me POW: ");
            pow = UserInput.getInteger();
            PS[i] = syn;
            PP[i] = pow;
            i++;
            
        }while (pow!=0);
        
        for (int j=0;j<=i;j++){
            PS[j] = PS[j]*PP[j];//Derivative
            PP[j] = PP[j]-1;//Derivative
            int A=doubleToFraction.turnUp(PS[j]); //Turn it into fraction
            int B=doubleToFraction.turnDown(PS[j]);
			
			/*If SYN | PS[j] = 0, then there is no need to show it to output.*/
			/* if A mod B -eq 0 then there is no need to show it as a fraction*/
			/* if PP[j] | pow -eq 0, then we just show the value of Syn*/
            if (PS[j] != 0 && A%B==0 && PP[j]!=0){
                System.out.print(((int)PS[j])+var+"^"+PP[j] + " + ");
            }
            if (PS[j] != 0 && A%B!=0 && PP[j]!=0){
                System.out.print("("+A+"/"+B+")"+var+"^"+PP[j] + " + ");
            }
            
            if (PS[j] != 0 && A%B!=0 && PP[j]==0){
                System.out.println("("+A+"/"+B+")");
            }
            
            if (PS[j] != 0 && A%B==0 && PP[j]==0){
                System.out.println(((int)PS[j]));
            }
        }
        System.out.println("");/*new line*/
        
    }
    
}
