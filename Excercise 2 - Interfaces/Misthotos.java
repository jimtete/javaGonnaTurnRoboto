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
public class Misthotos extends Employee implements iMisthotos{
    
    private double Akatharistos;
    private double Kratiseis;
    private double bonusPaidiwn;

    public Misthotos(double Akatharistos, double Kratiseis, double bonusPaidiwn, String eponymia, int payType) {
        super(eponymia, payType);
        this.Akatharistos = Akatharistos;
        this.Kratiseis = Kratiseis;
        this.bonusPaidiwn = bonusPaidiwn;
    }

    @Override
    public String getPayType() {
        return "Misthotos";
    }

    @Override
    public void Katharos_Misthotou() {
        double Salary;
        Salary = (this.Akatharistos - this.Kratiseis + this.bonusPaidiwn);
        System.out.println("Salary: "+Salary);
    }
    
    
}
