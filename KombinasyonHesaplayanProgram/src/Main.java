import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner sınıfını yazıyoruz ve değişkenleri oluşturuyoruz
        Scanner inp = new Scanner(System.in);

        int n, r;
        int nFakt = 1;
        int rFakt = 1;
        int nEksiRFakt = 1;

        System.out.print("1. Sayıyı Giriniz: ");
        n = inp.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        r = inp.nextInt();

        // n, r ve n-r  sayısı için faktöriyel hesaplıyoruz
        for (int i = 1; i <= n; i++) {
            nFakt *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFakt *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nEksiRFakt *= i;
        }
        int kombinasyon = nFakt / (rFakt * nEksiRFakt); // Formülü oluşturup sonucu ekrana yazdırıyoruz

        System.out.print("Kombinasyon Formülü Sonucu: " + kombinasyon);
    }
}
