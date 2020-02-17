
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            int tulos = (luku*luku);
            if (luku == 0) {
                break;
            } else if(luku < 0) {
                System.out.println("Epäkelpo luku");
            } else if (luku > 0) {
                System.out.println(tulos);
            
            }
        }
    }
}