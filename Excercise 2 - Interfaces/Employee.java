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
abstract class Employee {
    
    
    private String eponymia;
    private int payType;

    public Employee(String eponymia, int payType) {
        this.eponymia = eponymia;
        this.payType = payType;
    }
    
    abstract public String getPayType();

    public String getEponymia() {
        return eponymia;
    }

    public void setEponymia(String eponymia) {
        this.eponymia = eponymia;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    @Override
    public String toString() {
        return "Employee{" + "eponymia=" + eponymia + '}';
    }
    
    
    
}
