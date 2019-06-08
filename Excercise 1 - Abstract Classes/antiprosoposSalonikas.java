/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedexcercise1;

/**
 *
 * @author jim-t
 */
public class antiprosoposSalonikas extends Antiprosopoi_Poliseon {
    
    
    private double exodaMetakinisisTaxidion;

    public antiprosoposSalonikas(double exodaMetakinisisTaxidion, String eponymia, double posoPoliseon, int cityType, int bonusCode) {
        super(eponymia, posoPoliseon, cityType, bonusCode);
        this.exodaMetakinisisTaxidion = exodaMetakinisisTaxidion;
    }


    @Override
    String getBonusType() {
        if ( this.getBonusCode() == 0) return "No bonus";
        return "Bonus";
    }
    
    public String getCityType(){
        return "SALONIKA";
        
    }

    @Override
    void TelikoPosoPromitheias() {
        double bonus=0;
        if ( this.getBonusCode() == 1){
            bonus=2000;
        }
        double totalExpenses = this.getPosoPoliseon()*0.05 + this.exodaMetakinisisTaxidion + bonus;
        System.out.println("Total expenses: "+totalExpenses);
    }
    
    
    
    
}
