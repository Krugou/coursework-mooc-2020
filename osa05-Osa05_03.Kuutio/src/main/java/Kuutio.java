/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krugou
 */
public class Kuutio {
    private int sarmanpituus;
    private int sarmantilavuus;
            
    public Kuutio(int sarmanPituus){
        this.sarmanpituus = sarmanPituus;
    }
    public int tilavuus() {
        this.sarmantilavuus = this.sarmanpituus*this.sarmanpituus*this.sarmanpituus;
        return this.sarmantilavuus;
    } 
    
    public String toString(){
        return "Kuution särmän pituus on "+this.sarmanpituus+", tilavuus on "+tilavuus();
        
    }
}
