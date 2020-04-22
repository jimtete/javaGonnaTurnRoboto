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
public class tainiaDrash extends tainies {
    
    private String stuntDirector;
    private String cgiTeam;

    public tainiaDrash(String stuntDirector, String cgiTeam, int year, String name, String directorName) {
        super(year, name, directorName);
        this.stuntDirector = stuntDirector;
        this.cgiTeam = cgiTeam;
    }

    public String getStuntDirector() {
        return stuntDirector;
    }

    public void setStuntDirector(String stuntDirector) {
        this.stuntDirector = stuntDirector;
    }

    public String getCgiTeam() {
        return cgiTeam;
    }

    public void setCgiTeam(String cgiTeam) {
        this.cgiTeam = cgiTeam;
    }
    
    

    @Override
    public String getDirectorName() {
        return super.getDirectorName()+":Director \n"+this.getStuntDirector()+":Stunt director";
    }

    
    
    
}
