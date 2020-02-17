
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        //lue lista
        ArrayList<Integer> luvut = new ArrayList<>();

        int luku;

        while (true) {
            luku = Integer.valueOf(lukija.nextLine());

            if (luku == 9999) {

                break;
            }
            luvut.add(luku);
        }

      
        int pienin = luvut.get(0);

        for (int i = 0; i < luvut.size(); i++) {
            if (luvut.get(i) < pienin) {
                pienin = luvut.get(i);
            }

        }

        System.out.println("Pienin luku on " + pienin);
        
        
        
        for(int i = 0 ; i < luvut.size() ; i++){
            if(pienin == luvut.get(i)){
                System.out.println("Pienin luku löytyy indeksistä " + i);
            }
        }

    }
}