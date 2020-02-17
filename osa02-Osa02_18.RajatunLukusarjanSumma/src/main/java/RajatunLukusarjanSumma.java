
import java.util.Scanner;

public class RajatunLukusarjanSumma {


    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        System.out.println("Ensimmäinen");
        int ekaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int vikaluku = Integer.valueOf(lukija.nextLine());

        while (ekaluku <= vikaluku) {
            break;
        }

        for (int i = ekaluku; i <= vikaluku; i++) {
            summa = summa + i;
            System.out.println("Summa on " + summa);

        }
    }
}