import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        int n1, n2, select ;

        // Kullanıcıdan veri almak için Scanner sınıfını yazıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        n1 = inp.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        n2 = inp.nextInt();

        // Kullanıcıdan yapmak istediği işlemi istiyoruz
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapacağınız işlemi seçiniz: ");
        select = inp.nextInt();

        // Koşulları belirliyoruz ve ekrana yazdırıyoruz
        switch (select){
            case 1:
                System.out.println("Toplama İşleminin Sonucu: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Sonucu: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma İşleminin Sonucu: " + (n1*n2));
                break;
            case 4:
                if(n2==0){
                    System.out.println("Bir sayı 0'a bölünemez !");
                }else {
                    System.out.println("Bölme İşleminin Sonucu: " + (n1/n2) );
                }
                break;
            default:
                System.out.println("Hatalı Seçim yaptınız !");
        }
    }
}