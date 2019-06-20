/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klironomikotita;

/**
 *
 * @author jim-t
 */
public class Superclass {
    private String gender;
    private int age;
    
    Superclass(String g,int a){
        this.gender=g;
        this.age=a;
    }
    
    public void getGenderAndAge(){
        System.out.println("Yperklasi: To genos= "+gender+"H ilikia= "+ age);
    }
    
    
}
