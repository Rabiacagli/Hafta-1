import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
        Scanner inp = new Scanner(System.in);

        // Değişkenleri belirliyoru: i = sayaç (döngü sayısını belirler), n = kullanıcıdan alınacak sayı
        int n ;
        int total = 0;

        // Koşulları belirleyip döngüyü yazıyoruz
        do {
            System.out.print("Sayı Giriniz: ");
            n = inp.nextInt();
            if(n % 2 == 0 && n % 4 == 0){
                total += n;
            }
        }while(n % 2 == 0); // Kullanıcı tek girdiğinde döngü sona erer

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Çift ve dörde bölünebilen sayıların toplamı: " + total);
    }
}