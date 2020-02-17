public class TaulukonTulostaja {
 
    public static void main(String[] args) {
        // Tässä voit testata metodia
    }
 
    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        for(int luku: taulukko){
            if (luku == taulukko[taulukko.length - 1]) {
                System.out.print(luku + " ");
                break;
            }
            System.out.print(luku + ", ");
           
        }
    }
}