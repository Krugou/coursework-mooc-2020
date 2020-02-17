
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");
        int asti = Integer.valueOf(lukija.nextLine())+1;
        System.out.println("Mistä lähtien?");
        int lahti = Integer.valueOf(lukija.nextLine());
        for (int i = lahti; i < asti; i++) {
            System.out.println(i);
        } 
    }
}

