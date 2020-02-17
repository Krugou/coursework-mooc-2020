
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double lukuja = 0;
        double lukuja2 = 0;

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
        double lukuja3 = lukuja/lukuja2;
        System.out.println("Lukujen keskiarvo "+lukuja3);
        
    }
}
