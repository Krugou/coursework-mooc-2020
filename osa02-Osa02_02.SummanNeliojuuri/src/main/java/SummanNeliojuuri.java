
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku1 = Integer.valueOf(lukija.nextLine());
        int luku2 = Integer.valueOf(lukija.nextLine());
        int tulos = luku1 + luku2;
        double neliojuuri = Math.sqrt(tulos);
        System.out.println(neliojuuri);
        
    }
}
