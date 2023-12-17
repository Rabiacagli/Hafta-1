import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // kullanıcıdan veri alabilmek için Scanner sınıfını kullanıyor ve değişkenleri belirliyoruz
        Scanner inp = new Scanner(System.in);
        int number;
        int total = 0;
        System.out.print("Sayı Giriniz: ");
        number = inp.nextInt();

        // mükemmel sayının hesaplanması için döngü ve koşullarımızı oluşturuyoruz
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }  // koşulların sağlanması durumuna göre ekrana yazdırıyoruz
        if (total == number) {
            System.out.println(number + " Sayısı" + " Mükemmel Sayıdır. ");
        } else {
            System.out.println(number + " Sayısı" + " Mükemmel Sayı Değildir. ");
        }
    }
}