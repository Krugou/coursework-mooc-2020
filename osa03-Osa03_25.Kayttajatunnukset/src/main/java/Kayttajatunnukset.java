
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna tunnus: ");
        String nimi = lukija.nextLine();

        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();

        if ((nimi.equals("aleksi") && salasana.equals("tappara"))) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else if ((nimi.equals("elina") && salasana.equals("kissa"))) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }

    }
}
