import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.print(guessNumber());
    }

    static String guessNumber() {
        int rand = getRandNum(); // to czego szukamy
        System.out.println("wylosowana liczba: "+rand);
        String result = "trafiony";

        Scanner scanner = new Scanner(System.in);

        int guess = -1;
        do{
            try {
                System.out.println("podaj liczbe :");
                guess = scanner.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("to nie jest liczba");
                scanner.nextLine();
                continue; // wraca do try i spisuje liczbe ze skanera
            }
                if (guess > rand) {
                    System.out.println("za duzo");
                } else if(guess<rand) {
                    System.out.println("za malo");
                }
            }
            while (guess != rand);
        return result;
    }
    static int getRandNum() { //metoda 2
        Random r = new Random();
        return r.nextInt(100);
    }

}
