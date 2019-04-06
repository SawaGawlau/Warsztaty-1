import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        System.out.println(lotto());
    }

    static String lotto() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        int i=0;
        while(i<6) {
            System.out.println("podaj liczbe ");
            int number = scanner.nextInt();
            boolean sameNumber=false;
            for (int j=0; j<6; j++){
                if (!(number==numbers[j])){
                    sameNumber=false;
                }else{
                    System.out.println("ten numer sie powtarza");
                    sameNumber=true;
                    break;
                }
            }
            if ((number < 49 && number > 0)&&sameNumber==false){
                numbers[i] = number;
                i++;
            } else {
                System.out.println("podana liczba jest poza zakresem");
            }
        }
        Arrays.sort(numbers);
        return Arrays.toString(numbers);
    }

}
