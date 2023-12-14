import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
        Scanner input = new Scanner(System.in);

        //Değişkenleri belirliyoruz
        System.out.print("Mesafe(KM):");
        int distance = input.nextInt();

        System.out.print("Yaş: ");
        int age = input.nextInt();

        System.out.print("Yolculuk tipi (1: Tek Yön, 2: Gidiş-Dönüş) : ");
        int tripType = input.nextInt();

        double price = distance * 0.10;  // mesafe başına bilet ücreti belirliyoruz

        // Yaş koşullarını ve indirimleri belirliyoruz
        if (age <= 0 || distance <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz! ");
        }  else {
            if (age < 12) {
                // 12 yaşından küçükse %50 indirim
                price *= 0.5;
            } else if (age >= 12 && age <= 24) {
                // 12-24 yaş arasındaysa %10 indirim
                price *= 0.9;
            } else if (age >= 65) {
                // 65 yaşından büyükse %30 indirim
                price *= 0.7;
            }

            if (tripType == 2) {
                // Gidiş dönüş seçilmişse %20 indirim
                price *= 0.8;
                price = price * 2;    // Gidiş dönüş seçilmişse biletler 2 katı
            }
            System.out.println("Toplam bilet fiyatı: " + price + " TL");
        }
    }
}