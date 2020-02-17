
public class LukujenKeskiarvo {

    // toteuta tähän uudelleen aiemmin tekemäsi summametodi
public static void main(String[] args) {
    int eka = 5;
    int toka = 10;
    
    alustaKeskelle(eka, toka);

    System.out.println(eka);
}

public static void alustaKeskelle (int alku, int loppu) {
    int keski = (alku + loppu)/2;
    while (alku < keski) {
        System.out.println("askel");
        alku++;
    }
}
}