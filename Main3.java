
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    moreLess();
    }

    static void moreLess() {

        int max=1000;
        int min =0;
        int los = (max - min) / 2 + min;
        for (int i=0; i<10;i++) {
            System.out.println("zgaduje ze to: " + los);
            Scanner scanner = new Scanner(System.in);
            String lessMore = scanner.nextLine();
            if (lessMore.equals("less")) {
                max = los;
                los=((max-min)/2 +min);
            } else if(lessMore.equals("more")){
                min = los;
                los=((max-min)/2 +min);
            }else{
                System.out.println("brawo");
            }
        }
    }


}
