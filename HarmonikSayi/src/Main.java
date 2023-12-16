import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = inp.nextInt();

        double total = 0.0;

        for (int i = 1; i <= n; i++ ) {
            total += (1.0/i);
        }
        System.out.println("Harmonik Seri: " + total);
    }
}