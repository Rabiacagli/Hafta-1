import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan veri almak için Scanner sınıfı yazarak değişkenleri belirliyoruz
        Scanner input= new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        double matematik = input.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        double turkce = input.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        double fizik = input.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        double kimya = input.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        double muzik = input.nextDouble();


        //Ortalama alınır ve tüm koşullar belirlenir
        double avarage = ((matematik+turkce+fizik+kimya+muzik) / 5);

        if ((matematik>0 && matematik<100) && (turkce>0 && turkce<100) && (fizik>0 && fizik<100) && (kimya>0 && kimya<100) && (muzik>0 && muzik<100)) {

            if (avarage >= 55){

                System.out.println("Not Ortalaması:"+ avarage + " Puan");
                System.out.println("Sınıfı Geçtiniz. ");

            } else {
                System.out.println("Not Ortalaması:"+ avarage + " Puan");
                System.out.println("Sınıfta Kaldınız!");
            }
        } else {
            System.out.println("Geçersiz Not Girdiniz!! ");
        }
    }
}




























