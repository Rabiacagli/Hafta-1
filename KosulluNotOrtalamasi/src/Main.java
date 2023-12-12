import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenleri oluşturuyoruz
        int matematik, fizik, kimya, turkce, tarih, muzik ;

        // Scanner sınıfını oluşturuyoruz
        Scanner input = new Scanner(System.in);

        // aşağıdaki dersler için sınav puanlarını kullanıcıdan alıyoruz
        System.out.print("Matematik notunuzu giriniz: " );
        matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: " );
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: " );
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: " );
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: " );
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: " );
        muzik = input.nextInt();

        // ortalama alıyoruz
        int toplam = matematik + fizik + kimya + turkce + tarih + muzik ;
        double ortalama = (toplam/6);

        // ortalamayı ve kosulu belirleyip yazdırıyoruz
        System.out.println("Not Ortalamanız: " + ortalama );

        System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
