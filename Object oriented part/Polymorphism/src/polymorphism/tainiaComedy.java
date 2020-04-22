/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author jim-t
 */
public class tainiaComedy extends tainies {
    
    private String[] Writers;

    public tainiaComedy(String[] Writers, int year, String name, String directorName) {
        super(year, name, directorName);
        this.Writers = Writers;
    }

    public String[] getWriters() {
        return Writers;
    }

    public void setWriters(String[] Writers) {
        this.Writers = Writers;
    }
    
    @Override
    public String getDirectorName() {
        String writers="Writers{:";
        
        for (String temp : this.Writers){
            writers = writers + temp + "\n";
        }
        
        
        
        return super.getDirectorName()+":Director \n"+writers;
    }
    
}
