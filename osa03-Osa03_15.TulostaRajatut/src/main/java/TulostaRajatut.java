
import java.util.ArrayList;

public class TulostaRajatut {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(6);
        lista.add(-1);
        lista.add(5);
        lista.add(1);

        System.out.println("Luvut välillä [0,5]");
        tulostaRajatutLuvut(lista, 0, 5);

        System.out.println("Luvut välillä [3,10]");
        tulostaRajatutLuvut(lista, 3, 10);
    }

    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alaraja, int ylaraja) {
        for (int i = 0; i < luvut.size(); i++) {     // check later if it's luvut.size()-1
            if (luvut.get(i) >= alaraja && luvut.get(i) <= ylaraja) {
                System.out.println(luvut.get(i));
            }
        }
    }
}