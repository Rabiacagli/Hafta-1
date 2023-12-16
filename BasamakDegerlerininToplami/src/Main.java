import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int number = inp.nextInt();

        int basValue , total = 0;

        while (number != 0 ) {
            basValue = number % 10;
            total += basValue;
            number /= 10;
        }
        System.out.println("Basamak değerlerinin toplamı: " + total);
    }
}