 
import java.util.Scanner;
 
public class EnsimmaisetSanat {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
        String lause = lukija.nextLine();
                if (lause.equals("")) {
                break;
            }
        String[] result = lause.split(" ");
        String first = result[0];
        System.out.println(first);  
        }
            
          
 
    }
}