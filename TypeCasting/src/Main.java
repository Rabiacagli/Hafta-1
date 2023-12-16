import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);         // Kullanıcıdan tam sayı ve ondalıklı sayı alıyoruz.

        System.out.print("Bir tam sayı giriniz: ");
        int tamsayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondaliklisayi = input.nextDouble();

        double ondaliklisayi2 = tamsayi;                 // Tam sayıyı ondalıklı sayıya,
        int tamsayi2 = (int)ondaliklisayi;               // Ondalıklı sayıyı tam sayıya dönüştürüyoruz.

        System.out.println();
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürdük: " + ondaliklisayi2);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdük: " + tamsayi2);


    }
}