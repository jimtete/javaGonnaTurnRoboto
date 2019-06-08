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
public class antiprosoposOtherCity extends Antiprosopoi_Poliseon {

    public antiprosoposOtherCity(String eponymia, double posoPoliseon, int cityType, int bonusCode) {
        super(eponymia, posoPoliseon, cityType, bonusCode);
    }
    
    public String getCityType(){
        return "Other City";
        
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
            bonus=4000;
        }
        double totalExpenses = this.getPosoPoliseon()*0.09 + bonus;
        System.out.println("Total expenses: "+totalExpenses);
    }
    
    
    
    
    
}
