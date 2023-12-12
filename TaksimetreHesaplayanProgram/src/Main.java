import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri belirleriz
        int km;
        double perKm = 2.20 , toplamtutar, startPrice = 10 ;

        // Scanner sınıfı oluşturuyoruz ve kullanıcıdan veri alıyoruz
        Scanner input= new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz: ");
        km = input.nextInt();

        //Toplam tutarı hesaplıyoruz
        toplamtutar = (km * perKm);
        toplamtutar += startPrice;

        // Koşul oluşturuyoruz ve ekrana yazdırıyoruz
        toplamtutar = ( toplamtutar < 20) ? 20 : toplamtutar;
        System.out.println("Toplam Tutar: " + toplamtutar +"Tl");
    }
}