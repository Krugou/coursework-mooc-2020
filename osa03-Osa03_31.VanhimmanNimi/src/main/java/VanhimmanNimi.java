
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int vanhin = -1;
        String nimi = "";

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] osat = luettu.split(",");
            int ika = Integer.valueOf(osat[1]);
            if (ika > vanhin) {
                vanhin = ika;
                nimi = osat[0];
            }
        }

        System.out.println("Vanhimman nimi: " + nimi);

    }
}
