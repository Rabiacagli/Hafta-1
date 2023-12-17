import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         // kullanıcıdan veri almak için Scanner sınıfını yazıyor ve değişkenleri belirliyoruz
        Scanner input = new Scanner(System.in);
        int number, min = 0, max = 0, n;

        System.out.print("Girilecek sayı adedini belirtiniz: ");
        n = input.nextInt();
        // kullanıcının kaç adet sayı gireceğini bilmediğimiz için for döngüsü oluşturuyoruz.
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            number = input.nextInt();

            if (i == 1) {                      // min ve max değerler için koşul oluşturuyoruz
                max = number;                  // ve koşula göre ekrana yazdırıyoruz
                min = number;
            } else if (number > max) {
                max = number;

            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);

    }
}