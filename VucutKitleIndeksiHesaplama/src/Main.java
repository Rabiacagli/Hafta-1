import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz
        double kilo, boy;

        // Kullanıcıdan veri almak için Scanner sınıfını belirleriz
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = inp.nextDouble();

        System.out.print("Lütfen Boyunuzu (metre cinsinde) Giriniz: ");
        boy = inp.nextDouble();

        //Formülü oluşturup ekrana yazdırıyoruz
        double Vki = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + Vki);
    }
}