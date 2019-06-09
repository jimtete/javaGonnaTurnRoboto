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
public class Oromisthios extends Employee implements iOromisthios{
    
    private int oresErgasias;
    private double oromisthio;

    public Oromisthios(int oresErgasias, double oromisthio, String eponymia, int payType) {
        super(eponymia, payType);
        this.oresErgasias = oresErgasias;
        this.oromisthio = oromisthio;
    }

    @Override
    public String getPayType() {
        return "Oromisthios";
    }

    @Override
    public void Katharos_Oromisthiou() {
        double Salary;
        Salary = (this.oresErgasias*this.oromisthio) * 0.9;
        System.out.println("Salary: "+Salary);
    }
    
    
    
}
