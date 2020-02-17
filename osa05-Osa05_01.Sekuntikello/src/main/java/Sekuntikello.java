/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krugou
 */
public class Sekuntikello {
    private Viisari sadasosasekunnit;
    private Viisari sekunnit;

    public Sekuntikello() {
        
        this.sekunnit = new Viisari(60);
        this.sadasosasekunnit = new Viisari(100);
    }

    public void etene() {
        this.sadasosasekunnit.etene();

        if (this.sadasosasekunnit.arvo() == 0){
        this.sekunnit.etene();
        } if (this.sadasosasekunnit.arvo() == 100) {
            this.sekunnit.etene();
        }
}
    

    public String toString() {
        return this.sekunnit + ":" + this.sadasosasekunnit;
    }
}
