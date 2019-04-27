import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kod kostki:\n" +
                "xDy+z \n" + "x -liczba rzutów \n" + "y -ilość ścian \n" + "z -dodaj/odejmij \n");
        System.out.print("podaj parametry rzutu: ");
        String kodKostki = sc.nextLine();

        String[] parts = kodKostki.split("D");
        System.out.println(Arrays.toString(parts));

        int times = 1;
        int square = 0;

        if (parts[0].length() > 0) {
            times = Integer.parseInt(parts[0]);
        }

        String[] plus = parts[1].split("\\+");
        String[] minus = parts[1].split("-");

        int mod = 0;

        if (plus[1].length() > 0) {
            mod = Integer.parseInt(plus[1]);
            square = Integer.parseInt(plus[0]);

        } else if (minus[1].length() > 0) {
            mod = Integer.parseInt(plus[1]) * (-1);
            square = Integer.parseInt(minus[0]);
        }

        System.out.println("rzucam" + " " + times + " " + "razy kostką: " + square + " " + "ścienną");

        int result = 0;
        Random rnd = new Random();
        for (int i = 0; i < times; i++) {
            int probe = rnd.nextInt(square) + 1;
            System.out.println("rzuciłem: " + " " + result);
            result += probe;
        }
        result = result + mod;
        System.out.println("wynik: " + result);
    }
}