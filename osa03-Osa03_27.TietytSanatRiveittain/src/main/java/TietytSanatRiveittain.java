
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
             for (String l : luettu.split(" ")) {
                if (l.contains("av")) {
                    System.out.println(l);
                    
                }
            }
}

    }
}