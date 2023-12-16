import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int n = inp.nextInt();
        int star , blank ;

        for (int i = 1; i <= n; i++) {
            for (blank = 1; blank <= (n-i); blank++){
                System.out.print(" ");
            }
            for (star = 1; star <= ((2*i)-1);star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (blank = 1; blank < i; blank++) {
                System.out.print(" ");
            }
            for (star = 0; star <= (2 * (n - i)); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}