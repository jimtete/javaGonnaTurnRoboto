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
public class antiprosoposAthenas extends Antiprosopoi_Poliseon{

        
    private double exodaDiafimisis;
    private double exodaMetakinisis;

    public antiprosoposAthenas(double exodaDiafimisis, double exodaMetakinisis, String eponymia, double posoPoliseon, int cityType, int bonusCode) {
        super(eponymia, posoPoliseon, cityType, bonusCode);
        this.exodaDiafimisis = exodaDiafimisis;
        this.exodaMetakinisis = exodaMetakinisis;
    }

    public String getCityType(){
        return "Athena";
        
    }
    
    
    @Override
    String getBonusType() {
        if ( this.getBonusCode() == 0) return "No bonus";
        return "Bonus";
    }

    @Override
    void TelikoPosoPromitheias() {
        double bonus=0;
        if ( this.getBonusCode() == 1){
            bonus=1000;
        }
        double totalExpenses = this.getPosoPoliseon()*0.03 + this.exodaDiafimisis + this.exodaMetakinisis + bonus;
        System.out.println("Total expenses: "+totalExpenses);
    }
    
    
    
    
    
}
