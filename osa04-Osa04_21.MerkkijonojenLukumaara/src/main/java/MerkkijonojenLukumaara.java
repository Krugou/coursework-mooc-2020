import java.util.Scanner;
 
public class MerkkijonojenLukumaara {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int merkkijonojenLukumaara = 0;
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
                
            }
            merkkijonojenLukumaara = merkkijonojenLukumaara + 1;    
            }
        System.out.println(merkkijonojenLukumaara);
    }
}
