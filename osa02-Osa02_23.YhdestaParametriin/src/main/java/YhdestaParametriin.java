
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti(1);
    }
    public static void tulostaLukuunAsti(int luku) { 
                
            
        int kerrat = 0;
        while (kerrat < luku) {
            
            kerrat++;
            System.out.println(kerrat);
        }

    }
}
