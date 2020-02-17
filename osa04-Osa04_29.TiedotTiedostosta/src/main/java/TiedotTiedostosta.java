
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(",");

                String nimi = osat[0];
                int ika = Integer.valueOf(osat[1]);

                if (ika == 1) {
                    System.out.println(nimi + ", ikä: " + ika + " vuosi");
                } else {
                    System.out.println(nimi + ", ikä: " + ika + " vuotta");
                }
            }
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnstui.");
        }
    }
}