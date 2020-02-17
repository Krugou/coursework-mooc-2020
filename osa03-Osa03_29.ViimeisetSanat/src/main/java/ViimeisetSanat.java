 
import java.util.Scanner;
 
public class ViimeisetSanat {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
 
            String[] osat = luettu.split(" ");
            System.out.println(osat[osat.length - 1]);
        }
 
    }
}
