
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

  System.out.println("Syötä ensimmäinen luku!");
int eka = Integer.valueOf(lukija.nextLine());
System.out.println("Syötä toinen luku!");
int toka = Integer.valueOf(lukija.nextLine());
        System.out.println(eka+" + "+toka+ " = "+(eka+toka));
        System.out.println(eka+" - "+toka+ " = "+(eka-toka));
System.out.println(eka+" * "+toka+ " = "+(eka*toka));
double tulos1 = (double) eka/toka;
        System.out.println(eka+" / "+toka+ " = "+tulos1);

    }
}
