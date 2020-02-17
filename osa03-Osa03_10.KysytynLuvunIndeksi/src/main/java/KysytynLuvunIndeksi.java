
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                System.out.print("Mitä etsitään? ");
                int luku_etsi = Integer.valueOf(lukija.nextLine());
                int founded = 0;

                for (int i = 0; i <= lista.size(); i++) {

                    founded = lista.indexOf(i);
                    System.out.println("Luku " + i + " on indeksissä " + founded);

                    if (i == luku_etsi) {

                    }

                }
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        // toteuta tänne toiminnallisuus luvun etsimiseen
    }
}