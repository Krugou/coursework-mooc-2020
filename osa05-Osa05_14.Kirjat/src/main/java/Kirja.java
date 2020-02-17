
public class Kirja {

    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

    public boolean equals(Object verrattava) {
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne samat
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Kirja-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Kirja)) {
            return false;
        }

        // muunnetaan Object-tyyppinen verrattava-olio
        // Paivays-tyyppiseksi verrattavaKirja-olioksi
        Kirja verrattavaKirja = (Kirja) verrattava;

        return this.nimi.equals(verrattavaKirja.nimi)
                && this.julkaisuvuosi == verrattavaKirja.getJulkaisuvuosi();
    }
}
