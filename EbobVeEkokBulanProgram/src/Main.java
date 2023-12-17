import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      // kullanıcıdan veri alabilmek için Scanner sınıfını yazıyor ve değişkenleri atıyoruz.
        Scanner inp = new Scanner(System.in);
        int n1, n2;
        int ebob = 1;
        int i = 1;

        System.out.print("1. Sayıyı Giriniz: ");
        n1 = inp.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        n2 = inp.nextInt();

        // 1. ve 2. sayının birbirlerinden büyük olma koşuluna göre döngüler oluşturuyoruz
        // koşulun sağlanması durumunda ekrana yazdırıyoruz
        if (n1 <= n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u: " + ebob);
            System.out.println(n1 + " ve " + n2 + " sayılarının EKOK'u: " + (n1 * n2) / ebob);

        } else {
            if (n1 <= n2) {
                while (i <= n2) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        ebob = i;
                    }
                    i++;
                }
                System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u: " + ebob);
                System.out.println(n1 + " ve " + n2 + " sayılarının EKOK'u: " + (n1 * n2) / ebob);
            }
        }
    }
}