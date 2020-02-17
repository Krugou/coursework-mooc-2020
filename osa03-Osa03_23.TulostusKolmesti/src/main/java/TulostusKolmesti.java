  

import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        String message = lukija.nextLine();
        
        for ( int i = 0 ; i < 3 ; i++){
            System.out.print(message);
        }

    }
}
