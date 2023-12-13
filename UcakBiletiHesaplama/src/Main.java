import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
        Scanner input = new Scanner(System.in);

        //Değişkenleri belirliyoruz
        System.out.print("Mesafe(KM):");
        int mesafe = input.nextInt();

        System.out.print("Yaş: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipi (1: Tek Yön, 2: Gidiş-Dönüş) : ");
        int yolculukTipi = input.nextInt();


        double biletFiyati1 = mesafe * 0.10;  // mesafe başına bilet ücreti
        double biletFiyati2 = biletFiyati1*2; // çift yön bilet ücreti

        // Yaş koşullarını ve indirimleri belirliyoruz
        if (yas <= 0 || mesafe <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz! ");
        } else {

            //Tek yön olması durumundaki yaş indirimleri
            if (yolculukTipi == 1) {

                if (yas < 12) {
                    biletFiyati1*=0.50;

                } else if (yas >= 12 && yas <= 24) {
                    biletFiyati1 *= 0.90;

                } else if (yas >= 65) {
                    biletFiyati1 *= 0.70;

                } //tek yön için koşullar sağlanırsa ekrana yazdırıyoruz
                System.out.println("Bilet Fiyatı: " + biletFiyati1 + " TL");

                // Çift yön olması durumunda yaş indirimleri hesaplanır
            }else {
                if (yas < 12) {
                    biletFiyati2*=0.50;

                } else if (yas >= 12 && yas <= 24) {
                    biletFiyati2 *= 0.90;

                } else if (yas >= 65) {
                    biletFiyati2 *= 0.70;
                }//çift yön için koşullar sağlanırsa ekrana yazdırıyoruz
                System.out.println("Bilet Fiyatı: " + (biletFiyati2*0.80) + " TL");
            }
        }
    }
}


