/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkliniki;

/**
 *
 * @author user
 */
public class Orthopediko extends Kliniki implements iOrthopediko{
    private double exodaXeirourgiou;

    public Orthopediko(double exodaXeirourgiou, String onomaKlinikis, int tmima, int typosTherapeias, double kostosEpiskepsis, int typosDwmatiou, int meresTherapeias) {
        super(onomaKlinikis, tmima, typosTherapeias, kostosEpiskepsis, typosDwmatiou, meresTherapeias);
        this.exodaXeirourgiou = exodaXeirourgiou;
    }

    @Override
    public void eidosTherapias() {
        String answer;
        answer="Genna";
        if (this.getTyposTherapeias()== 1)answer="Apli episkepsi";
        if (this.getTyposTherapeias()== 2)answer="Xeirourgio";
        System.out.println("Eidos therapeias: "+answer);
    }

    @Override
    public void pliroteoPoso() {
        double cost=this.getKostosEpiskepsis();
        if (this.getTyposTherapeias() != 1){
            if (this.getTyposDwmatiou()== 0){
                cost = cost + 200*this.getMeresTherapeias();
            }else{
                if (this.getTyposDwmatiou() == 1){
                    cost = cost +150*this.getMeresTherapeias();
                }else{
                    cost = cost + 100*this.getMeresTherapeias();
                }
            }
        }
        if (this.getTyposTherapeias()== 2)cost = cost + this.exodaXeirourgiou;
        System.out.println("Pliroteo poso: "+ cost);
    }
    
    public String getTmima(){
        return "Orthopediko";
    }
    
}
