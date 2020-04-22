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
public class tainiaDrama extends tainies {
    
    private String[] Actors;

    public tainiaDrama(String[] Actors, int year, String name, String directorName) {
        super(year, name, directorName);
        this.Actors = Actors;
    }

    public String[] getActors() {
        return Actors;
    }

    public void setActors(String[] actors) {
        this.Actors = actors;
    }

    @Override
    public String getDirectorName() {
        String actors="Actors{:";
        
        for (String temp : this.Actors){
            actors = actors + temp + "\n";
        }
        
        return super.getDirectorName()+":Director \n"+actors;
    }
    
    
    
}
