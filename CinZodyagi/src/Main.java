import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       //Kullanıcıdan veri almak için SCanner sınıfını kullanıyoruz
        Scanner input= new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumyili = input.nextInt();

        // Koşulları oluşturup ekrana çıktısını yazdırıyoruz
        if(dogumyili % 12 == 0) {
            System.out.println("Çin zodyağı burcunuz Maymun. ");

        } else if (dogumyili % 12 == 1) {
            System.out.println("Çin zodyağı burcunuz Horoz. ");

        } else if (dogumyili % 12 == 2) {
            System.out.println("Çin zodyağı burcunuz Köpek. ");

        } else if (dogumyili % 12 == 3) {
            System.out.println("Çin zodyağı burcunuz Domuz. ");

        } else if (dogumyili % 12 == 4) {
            System.out.println("Çin zodyağı burcunuz Fare. ");

        } else if (dogumyili % 12 == 5) {
            System.out.println("Çin zodyağı burcunuz Öküz. ");

        } else if (dogumyili % 12 == 6) {
            System.out.println("Çin zodyağı burcunuz Kaplan. ");

        } else if (dogumyili % 12 == 7) {
            System.out.println("Çin zodyağı burcunuz Tavşan. ");

        } else if (dogumyili % 12 == 8) {
            System.out.println("Çin zodyağı burcunuz Ejderha. ");

        } else if (dogumyili % 12 == 9) {
            System.out.println("Çin zodyağı burcunuz Yılan. ");

        } else if (dogumyili % 12 == 10) {
            System.out.println("Çin zodyağı burcunuz At. ");

        } else if (dogumyili % 12 == 11) {
            System.out.println("Çin zodyağı burcunuz Koyun. ");
        }
    }
}
