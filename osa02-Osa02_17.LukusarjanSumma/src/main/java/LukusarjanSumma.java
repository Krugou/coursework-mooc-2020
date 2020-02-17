
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");
        int asti = Integer.valueOf(lukija.nextLine())+1;
        int tulos = 0;    
        int i = 0;
        while (i < asti) {
            tulos += i;
            i++;
        }

        System.out.println("Summa on "+tulos);
    }
}


