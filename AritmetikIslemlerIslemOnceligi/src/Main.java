import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz
        int a,b,c;

        // Kullanıcıdan veri almak için Scanner sınıfını yazıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a = inp.nextInt();

        System.out.print("b sayısını giriniz: ");
        b = inp.nextInt();

        System.out.print("c sayısını giriniz: ");
        c = inp.nextInt();

        // Formülü yazıp ekrana yazdırıyoruz
        int sonuc = a + b * c - b;
        System.out.println("Sonuç: " + sonuc);
    }
}