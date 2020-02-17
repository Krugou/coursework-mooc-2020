
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
                
            }
            int luku = Integer.parseInt(rivi);
            luku = luku * luku * luku;  
             System.out.println(luku);
            }
        
    }
}
   