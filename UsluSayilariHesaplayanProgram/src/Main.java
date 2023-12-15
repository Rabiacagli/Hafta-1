import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int base, power, total=1;

        System.out.print("Taban Sayısını Giriniz: ");
        base = inp.nextInt();

        System.out.print("Üssü Giriniz: ");
        power = inp.nextInt();

        for (int i = 1; i <= power; i++){
            total *= base;
        }
        System.out.println(total);
    }
}