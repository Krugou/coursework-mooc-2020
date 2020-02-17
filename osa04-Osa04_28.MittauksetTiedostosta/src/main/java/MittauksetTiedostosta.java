import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            int lukuja = 0;
            while (tiedostonLukija.hasNextLine()) {
                String lukuMerkkijonona = tiedostonLukija.nextLine();
                int luku = Integer.valueOf(lukuMerkkijonona);

                if (luku >= alaraja && luku <= ylaraja) {
                    lukuja++;
                }
            }

            System.out.println("Lukuja: " + lukuja);
        } catch (Exception ex) {
            System.out.println("Virhe tiedoston " + tiedosto + " lukemisessa.");
        }
    }

}
