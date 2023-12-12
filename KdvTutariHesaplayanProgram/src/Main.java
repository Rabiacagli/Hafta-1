import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını oluşturuyoruz
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan veri alıyoruz
        System.out.print("Tutarı Giriniz: ");
        double tutar = input.nextDouble();

        // Koşul oluşturuyoruz ve ekrana yazdırıyoruz
        double kdvliTutar = tutar < 1000 ? tutar*1.18 : tutar*1.08;
        System.out.println("Kdv dahil tutar: " + kdvliTutar);
    }
}
                    