
import java.io.File;
import java.util.Scanner;
 
public class LoytyykoTiedostosta {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
 
        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
       
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
           
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
               
                if (rivi.equals(etsittava)) {
                    System.out.println("Löytyi!");
                    break;
                } else if (!(tiedostonLukija.hasNextLine())) {
                    System.out.println("Ei löytynyt");
                }
            }
           
        } catch (Exception e) {
            System.out.println("Tiedoston "+tiedosto+" lukeminen epäonnistui.");
        }
 
    }
}
