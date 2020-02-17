
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                System.out.println("Mistä? ");//e.g. 2
                int mista = Integer.valueOf(lukija.nextLine());
                
                System.out.println("Mihin? "); // e.g. 4
                int mihin = Integer.valueOf(lukija.nextLine());
                
                
                while(mista <= mihin){
                    System.out.println(luvut.get(mista));
                    ++mista;
                    
                }
                break;
            }

            luvut.add(luku);
        }

    }
}

