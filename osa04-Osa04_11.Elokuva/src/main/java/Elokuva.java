/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krugou
 */
public class Elokuva {
    private int ikaraja;
    private String nimi;
    public Elokuva(String elokuvanNimi, int elokuvanIkaraja){
        this.ikaraja = elokuvanIkaraja;
        this.nimi = elokuvanNimi;
        }
      public String nimi(){
            System.out.println(this.nimi);
            return this.nimi;
            
        }
        public int ikaraja(){
            System.out.println("");
            return this.ikaraja;
            
        }
    }
    

