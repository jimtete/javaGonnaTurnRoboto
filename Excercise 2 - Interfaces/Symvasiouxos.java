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
public class Symvasiouxos extends Employee implements iSymvasiouxos{
    
    private double akatharistos;
    private double kratiseis;
    private int diarkeiaSymvasis;

    public Symvasiouxos(double akatharistos, double kratiseis, int diarkeiaSymvasis, String eponymia, int payType) {
        super(eponymia, payType);
        this.akatharistos = akatharistos;
        this.kratiseis = kratiseis;
        this.diarkeiaSymvasis = diarkeiaSymvasis;
    }

    @Override
    public String getPayType() {
        return "Symvasiouxos";
    }

    
    
    public void Katharos_Symvasiouxou() {
        double Salary;
        Salary = (this.akatharistos - this.kratiseis - (this.akatharistos - this.kratiseis)*this.diarkeiaSymvasis/100);
        System.out.println("Salary: "+Salary);
    }
    
}
