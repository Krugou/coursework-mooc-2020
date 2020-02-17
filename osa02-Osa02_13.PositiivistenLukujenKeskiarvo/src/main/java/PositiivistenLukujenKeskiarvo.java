
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.println("Monesko kävijä: ");
int y = Integer.valueOf(x.nextLine());

if (y <= 1000 && y % 25 == 0 ) {
    System.out.println("Saa lahjakortin!");
} else if (y % 2000 == 0) {
    System.out.println("Saa ison lahjakortin!");
} else {
    System.out.println("Ei saa mitään.");
}
}
}