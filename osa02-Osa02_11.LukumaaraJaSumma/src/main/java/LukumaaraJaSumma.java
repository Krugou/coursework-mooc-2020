
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        int lukuja2 = 0;
        while (true) {
            System.out.println("Syötä luku");
           
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) { 
                break;
            } else { 
                lukuja = lukuja + luku;
                lukuja2 = lukuja2 + 1;
            
            }
    
        }
        System.out.println("Lukuja yhteensä "+lukuja2);
        System.out.println("Lukujen summa "+lukuja);
    }
}
