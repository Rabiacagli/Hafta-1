import java.util.Scanner;
/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
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

        //İndirimleri belirliyoruz
        double biletFiyati = mesafe * 0.10;
        double indirimliFiyat1 = biletFiyati * 0.50;
        double indirimliFiyat2 = biletFiyati * 0.90;
        double indirimliFiyat3 = biletFiyati * 0.70;

        //Koşulları belirliyoruz
        if (yas <= 0 || mesafe <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz! ");
        } else {

            //Tek yön olması durumundaki tüm koşulları belirliyoruz
            if (yolculukTipi == 1) {

                if (yas < 12) {
                    System.out.println("Bilet Fiyatı: " + indirimliFiyat1 + " TL");
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Bilet Fiyatı: " + indirimliFiyat2 + " TL");
                } else if (yas >= 65) {
                    System.out.println("Bilet Fiyatı: " + indirimliFiyat3 + " TL");
                } else {
                    System.out.println("Bilet Fiyatı: " + biletFiyati + " TL");
                }
            // Gidiş-Dönüş olması durumundaki tüm koşulları belirliyoruz
            } else {
                if (yas < 12) {
                    System.out.println("Bilet Fiyatı: " + 2 * (indirimliFiyat1 * 0.80) + " TL");
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Bilet Fiyatı: " + 2 *(indirimliFiyat2 * 0.80) + " TL");
                } else if (yas >= 65) {
                    System.out.println("Bilet Fiyatı: " + 2 *(indirimliFiyat3 * 0.80) + " TL ");
                } else {
                    System.out.println("Bilet Fiyatı: " + 2 *(biletFiyati * 0.80) + " TL");
                }
            }
        }
    }
}
