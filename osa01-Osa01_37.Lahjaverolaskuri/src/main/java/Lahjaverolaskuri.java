
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double vero1 = 0.08;
        double vero2 = 0.10;
        double vero3 = 0.12;
        double vero4 = 0.15;
        double vero5 = 0.17;
        System.out.println("Lahjan suuruus?");
        int lahja = Integer.valueOf(lukija.nextLine());
        if (lahja  <=4999) {
            System.out.println("Ei veroa");
        } else if (lahja >=5000 && lahja <=25000) { 
            System.out.println("Vero1: "+(100+(lahja-5000)*vero1));
            
        } else if (lahja >=25001 && lahja <=55000) { 
            System.out.println("Vero2: "+(1700+(lahja-25000)*vero2));
            
        } else if (lahja >=55001 && lahja <=200000) { 
            System.out.println("Vero3: "+(4700+(lahja-55000)*vero3));
            
        } else if (lahja >=200001 && lahja <=1000000) { 
            System.out.println("Vero4: "+(22100+(lahja-200000)*vero4));
            
        } else if (lahja >=1000001) { 
            System.out.println("Vero5: "+(142100+(lahja-1000000)*vero5));
            
        } 
    }
}
