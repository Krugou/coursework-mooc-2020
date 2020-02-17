
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int alku = 0;
        int loppu = Integer.valueOf(lukija.nextLine());
        int loppu2 = loppu + 1;
        for (int i = alku; i < loppu2; i++) {
            System.out.println(i);
        } 
    }
}