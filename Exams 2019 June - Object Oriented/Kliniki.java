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
abstract class Kliniki {
    
    
    private String onomaKlinikis;
    private int tmima;
    private int typosTherapeias;
    private double kostosEpiskepsis;
    private int typosDwmatiou;
    private int meresTherapeias;

    public Kliniki(String onomaKlinikis, int tmima, int typosTherapeias, double kostosEpiskepsis, int typosDwmatiou, int meresTherapeias) {
        this.onomaKlinikis = onomaKlinikis;
        this.tmima = tmima;
        this.typosTherapeias = typosTherapeias;
        this.kostosEpiskepsis = kostosEpiskepsis;
        this.typosDwmatiou = typosDwmatiou;
        this.meresTherapeias = meresTherapeias;
    }

    @Override
    public String toString() {
        return "Kliniki{" + "onomaKlinikis=" + onomaKlinikis + ", kostosEpiskepsis=" + kostosEpiskepsis + ", typosDwmatiou=" + typosDwmatiou + ", meresTherapeias=" + meresTherapeias + '}';
    }
    
    

    public String getOnomaKlinikis() {
        return onomaKlinikis;
    }

    public String getTmima() {
        if (tmima==1)return "Gynaikologiko";
        if (tmima==2)return "Orthopediko";
        return "Paidiatriko";
    }
    
    public abstract void eidosTherapias();

    public int getTyposTherapeias() {
        return typosTherapeias;
    }

    public double getKostosEpiskepsis() {
        return kostosEpiskepsis;
    }

    public int getTyposDwmatiou() {
        return typosDwmatiou;
    }

    public int getMeresTherapeias() {
        return meresTherapeias;
    }

    public void setOnomaKlinikis(String onomaKlinikis) {
        this.onomaKlinikis = onomaKlinikis;
    }

    public void setTmima(int tmima) {
        this.tmima = tmima;
    }

    public void setTyposTherapeias(int typosTherapeias) {
        this.typosTherapeias = typosTherapeias;
    }

    public void setKostosEpiskepsis(double kostosEpiskepsis) {
        this.kostosEpiskepsis = kostosEpiskepsis;
    }

    public void setTyposDwmatiou(int typosDwmatiou) {
        this.typosDwmatiou = typosDwmatiou;
    }

    public void setMeresTherapeias(int meresTherapeias) {
        this.meresTherapeias = meresTherapeias;
    }
    
    
    
}
