import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // kullanıcıdan veri almak için Scanner sınıfını yazıyoruz
        Scanner inp = new Scanner(System.in);

        // değişkenleri belirliyoruz
        System.out.print("Satır Sayısını Giriniz: ");
        int n = inp.nextInt();
        int blank, star;

        // ters üçgeni oluşturmak için for döngüsüyle koşulları belirliyor ve ekrana yazdırıyoruz
        for (int i = 1; i <= n; i++) {

            for (blank = 1; blank < i; blank++) {
                System.out.print(" ");
            }
            for (star = 0; star <= (2 * (n - i)); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}