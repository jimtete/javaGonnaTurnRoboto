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
abstract class Antiprosopoi_Poliseon {
    private String eponymia;
    private double posoPoliseon;
    private int cityType;
    private int bonusCode;
    
    
    public Antiprosopoi_Poliseon(String eponymia, double posoPoliseon, int cityType, int bonusCode) {
        this.eponymia = eponymia;
        this.posoPoliseon = posoPoliseon;
        this.cityType = cityType;
        this.bonusCode = bonusCode;
    }

    public String getEponymia() {
        return eponymia;
    }

    public void setEponymia(String eponymia) {
        this.eponymia = eponymia;
    }

    public double getPosoPoliseon() {
        return posoPoliseon;
    }

    public void setPosoPoliseon(double posoPoliseon) {
        this.posoPoliseon = posoPoliseon;
    }

    public String getCityType() {
        if ( this.cityType == 1 )return "Athens";
        if ( this.cityType == 2 )return "Salonika";
        return "Other City";
    }

    public void setCityType(int cityType) {
        this.cityType = cityType;
    }

    public int getBonusCode() {
        return bonusCode;
    }

    public void setBonusCode(int bonusCode) {
        this.bonusCode = bonusCode;
    }
    
    abstract String getBonusType();
    abstract void TelikoPosoPromitheias();

    @Override
    public String toString() {
        return "Antiprosopoi_Poliseon{" + "eponymia=" + eponymia + ", posoPoliseon=" + posoPoliseon + ", cityType=" + cityType + ", bonusCode=" + bonusCode + '}';
    }
    
    
    
}
