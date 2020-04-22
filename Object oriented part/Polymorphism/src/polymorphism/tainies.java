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
public class tainies {
    
    private int year;
    private String name;
    private String directorName;

    public tainies(int year, String name, String directorName) {
        this.year = year;
        this.name = name;
        this.directorName = directorName;
    }
    
    
    
    public int yearsOld(){
        return 2020-year;
    }
    
    public boolean isDirector(String onoma){
        return onoma==this.directorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
    
    
    
}
